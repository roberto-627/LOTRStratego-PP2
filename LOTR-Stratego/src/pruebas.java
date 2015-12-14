
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import lotr.stratego.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Melara
 */
public class pruebas {
    public static void main(String[] args) throws IOException {
        ArrayList<String> ult10 = new ArrayList<>();
        ult10.add("hola");
        ult10.add("holla");
        ult10.add("gola");
        ult10.add(0, "adios");
        
        for(Object o: ult10.toArray()){
            System.out.println(o.toString());
        }
        
        File usuariosFile = new File("Hola");
        usuariosFile.mkdir();
        System.out.println(usuariosFile.exists());
        
        RandomAccessFile h = new RandomAccessFile("hola.cds", "rw");
        h.writeUTF("holas");
        RandomAccessFile g = new RandomAccessFile("jola.cds", "rw");
        g.writeUTF("12345");
        RandomAccessFile r = new RandomAccessFile("gola.cds", "rw");
        r.writeUTF("fgrhj");
        System.out.println(h.length());
        System.out.println(g.length());
        System.out.println(r.length());
        
        System.out.println("String length");
        System.out.println("Holas".length());
        
        RandomAccessFile users = new RandomAccessFile(Player.usuariosFile,"rw");
        System.out.println("Player");
        System.out.println(users.readUTF());
        System.out.println(users.readUTF());
        System.out.println(users.readInt());
        System.out.println(users.readInt());
        System.out.println(users.readInt());
        System.out.println(users.readInt());      
        for(int pos = 0; pos < 10; pos++){
            System.out.println(users.readUTF());
        }
        System.out.println(users.readBoolean());
    }
    
    
}
