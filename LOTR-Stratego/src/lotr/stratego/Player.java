/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Roberto Melara
 */
public class Player{
    //Atributos de cada player.
    String username;
    String password;
    int puntos;
    int partidas;
    int fuerzaBien;
    int fuerzaMal;
    ArrayList <String> Ultimos10;
    boolean activo;
    
    //File que contiene a los usuarios y sus datos
    public static File usuariosFile = new File("Users.lotr");
    
    /*
    Formato de Archivo:
        -String username
        -String password
        -int puntos
        -int partidas
        -int fuerzasBien
        -int fuerzasMal
        -Boolean Activo
    */
    
    //Constructores de Players.
    //Player nuevo.
    public Player(String un, String pass){
       //Iniciaizacion de atributos.
        username = un;
        password = pass;
        puntos = 0;
        partidas = 0;
        fuerzaBien = 0;
        fuerzaMal = 0;
        Ultimos10 = new ArrayList<>();
        activo = true;
    }
    //Player con datos cargados.
    public Player(String un, String pass, int p, int part, int fB, int fM, ArrayList<String> ult10, boolean act){
        //Iniciaizacion de atributos.
        username = un;
        password = pass;
        puntos = p;
        partidas = part;
        fuerzaBien = fB;
        fuerzaMal = fM;
        Ultimos10 = ult10;
        activo = act;
    }
    
    //Funcion para buscar a el player pos username en el archivo.
    public static long buscar(String usern)throws IOException{
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(usuariosFile,"rw"); 

        //Inicio de Archivo que contiene a los players.
        users.seek(0);

        //Apuntador a el inicio de un player.
        long player_init = 0;

        while(users.getFilePointer() < users.length()){
            player_init = users.getFilePointer();
            if(users.readUTF().equals(usern)){
                //Se retorna la pos de los datos de ese player en el archivo.
                return player_init;
            }else{
                users.readUTF();
                users.readInt();
                users.readInt();
                users.readInt();
                users.readInt();
                users.readBoolean();
            }  
        }
        return -1;
    }
    
    //Funcion para agregar nuevo player a el archivo.
    public static void agregarPlayer(Player p) throws IOException{
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        //Crear Carpeta de usuario.
        File carpeta = new File(p.username);
        carpeta.mkdir();
        File ult10 = new File( p.username + "/Ult10" + p.username + ".lotr");
        
        //Ir al Final de el Archivo.
        users.seek(users.length());
        //Comenzar a escribir en archivo.
        users.writeUTF(p.username);
        users.writeUTF(p.password);
        users.writeInt(p.puntos);
        users.writeInt(p.partidas);
        users.writeInt(p.fuerzaBien);
        users.writeInt(p.fuerzaMal);
        users.writeBoolean(true);
    }
    
    //Funcion para determinar si un usuario esta activo.
    public boolean isActive(Player p) throws IOException{
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(buscar(p.username));
        users.readUTF();
        users.readUTF();
        users.readInt();
        users.readInt();
        users.readInt();
        users.readInt();
        return users.readBoolean();
    }
    
    //Funcion para el SignIn.
    public static int signIn(String usern, String pass) throws IOException{
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(0);
        if(buscar(usern) != -1){
            users.readUTF();
            //Verificar que usuario este activo.
            String passref = users.readUTF();
            users.readInt();
            users.readInt();
            users.readInt();
            users.readInt();
            if(users.readBoolean()){
                if(pass.equals(passref)){
                    return 0;
                }else{
                    return 2;
                }
            }  
        }
        return 1;
    }
    
    //Funcion para cargar datos de Player.
    public static Player cargarDatos(String usern) throws FileNotFoundException, IOException{
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(buscar(usern));
        //Comenzar a leer en archivo.
        String usernam = users.readUTF();
        String pass = users.readUTF();
        int punt =  users.readInt();
        int part = users.readInt();
        int fuerzaB = users.readInt();
        int fuerzaM = users.readInt();
        ArrayList<String> ultj=  new ArrayList<>();
        for(int pos = 0; pos < 10; pos++){
            ultj.add(users.readUTF());
        }
        boolean activo = users.readBoolean();
        
        return new Player(usernam, pass, punt, part, fuerzaB, fuerzaM, ultj, activo);
    }
    
    //Funcion que devuelve cantidad de players Activos.
    public static int Activos() throws IOException{
        int ContAct = 0;
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(0);
        while(users.getFilePointer() < users.length()){        
            users.readUTF();
            users.readUTF();
            users.readInt();
            users.readInt();
            users.readInt();
            users.readInt();
            for(int pos = 0; pos < 10; pos++){
                users.readUTF();
            }
            if(users.readBoolean()){
                ContAct ++;
            }
        }
        return ContAct;
    }
    
    //Funcion que devuelve la cantidad de usuarios historicos.
    public static int Historicos() throws IOException{
        int ContHist = 0;
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(0);
        while(users.getFilePointer() < users.length()){        
            users.readUTF();
            users.readUTF();
            users.readInt();
            users.readInt();
            users.readInt();
            users.readInt();
            for(int pos = 0; pos < 10; pos++){
                users.readUTF();
            }
            users.readBoolean();
            ContHist ++;   
        }
        return ContHist;
    }
    
    //Funcion que retorna la cantidad de partidas jugadas (Global).
    public static int PartidasHistoricas() throws IOException{
        int PartHist = 0;
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(0);
        while(users.getFilePointer() < users.length()){        
            users.readUTF();
            users.readUTF();
            users.readInt();
            PartHist += users.readInt();
            users.readInt();
            users.readInt();
            for(int pos = 0; pos < 10; pos++){
                users.readUTF();
            }
            users.readBoolean();   
        }
        return PartHist;
    }
    
    //Funcion que retorna el num de veces que se ha jugado con las Fuerzas del Bien(Global).
    public static int FBHistoricas() throws IOException{
        int FB = 0;
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(0);
        while(users.getFilePointer() < users.length()){        
            users.readUTF();
            users.readUTF();
            users.readInt();
            users.readInt();
            FB += users.readInt();
            users.readInt();
            for(int pos = 0; pos < 10; pos++){
                users.readUTF();
            }
            users.readBoolean();   
        }
        return FB;
    }
    
    //Funcion que retorna el num de veces que se ha jugado con las Fuerzas del Mal(Global).
    public static int FMHistoricas() throws IOException{
        int FM = 0;
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(0);
        while(users.getFilePointer() < users.length()){        
            users.readUTF();
            users.readUTF();
            users.readInt();
            users.readInt();
            users.readInt();
            FM += users.readInt();
            for(int pos = 0; pos < 10; pos++){
                users.readUTF();
            }
            users.readBoolean();   
        }
        return FM;
    }
    
    //Funcion que retorna un arreglo con las ultimas 10 partidas jugadas.
    public static String[] Ult10ToTable(Player p){
        String[] ult10 =  new String[10];
        Object[] playerUlt10 = p.Ultimos10.toArray();
        for(int pos= 0; pos <10; pos ++){
            ult10[pos] = playerUlt10[pos].toString();
        }
        return ult10;
    }
    
    public static String[] encabezados(){
        String head[] = {"Posicion","Usuario","Puntos"};
        return head;
    }
    
    public static void guardar(String usern) throws IOException{
        //RandomAccessFile para el manejo de usuarios.
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        users.seek(0);
        
        //Ubicarse en la pos de el player
        buscar(usern);
        
        //Sobreescribir datos.
        users.writeUTF(MainMenu.Player1.username);
        users.writeUTF(MainMenu.Player1.password);
        users.writeInt(MainMenu.Player1.puntos);
                  
        users.writeInt(MainMenu.Player1.partidas);
        users.writeInt(MainMenu.Player1.fuerzaBien);
        users.writeInt(MainMenu.Player1.fuerzaMal);
        Object[] ult10j = MainMenu.Player1.Ultimos10.toArray();
        for(int p = 0 ; p < 10; p++){
            users.writeUTF(ult10j[p].toString());
        }
        users.writeBoolean(MainMenu.Player1.activo);
    }
   
}
