/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

//Imports
import Fichas.Ficha;
import Fichas.FichaBandera;
import Fichas.FichaFortaleza;
import Fichas.FichaRango1;
import Fichas.FichaRango10;
import Fichas.FichaRango2;
import Fichas.FichaRango3;
import Fichas.FichaRango4;
import Fichas.FichaRango5;
import Fichas.FichaRango6;
import Fichas.FichaRango7;
import Fichas.FichaRango8;
import Fichas.FichaRango9;
import java.util.Random;

/*
 * @author Roberto Melara
 */
public class Tablero {
    //Declaracion de generador aleatorio.
    Random  rnd = new Random();
    //Declaracion de Arreglo de tipo Ficha.
    public Ficha Tablero[][] = new Ficha[10][10];
    
    //Funcion para colocar las banderas.
    public void colocarBanderas(){
        colocarBanderas(1,0,0);
    }
    public void colocarBanderas(int faccion, int Banderas, int Fortalezas){
        if(Banderas < 2){
            if(faccion == 1){
                int c = rnd.nextInt(8)+1;
                Tablero[0][c] = new FichaBandera(faccion);
                Banderas ++;
                Tablero[0][c-1] = new FichaFortaleza(faccion);
                Fortalezas ++;
                Tablero[0][c+1] = new FichaFortaleza(faccion);
                Fortalezas ++;
                Tablero[1][c] = new FichaFortaleza(faccion);
                Fortalezas ++;
                System.out.println("Bandera Gondor Colocada.");
                colocarBanderas(2, Banderas, Fortalezas);
            }else{
                int c = rnd.nextInt(8)+1;
                Tablero[9][c] = new FichaBandera(2);
                Banderas ++;
                Tablero[9][c-1] = new FichaFortaleza(2);
                Fortalezas ++;
                Tablero[9][c+1] = new FichaFortaleza(2);
                Fortalezas ++;
                Tablero[8][c] = new FichaFortaleza(2);
                Fortalezas ++;
                System.out.println("Bandera Mordor Colocada.");
            }
        }
    }
    
    int FortalezasGondor = 0;
    int FortalezasMordor = 0;
    //Funcion para colocar las fortalezas.
    public void colocarFortalezasGondor(){
        do{
            int f = rnd.nextInt(2);
            int c = rnd.nextInt(9);
            if(Tablero[f][c] == null){
                Tablero[f][c] = new FichaFortaleza(1);
                FortalezasGondor ++;
            }
        }while(FortalezasGondor < 3);
        System.out.println("Coloque Fortalezas Gondor.");
    }
    
    public void colocarFortalezasMordor(){
        do{
            int f = rnd.nextInt(10-8)+8;
            int c = rnd.nextInt(9);
            if(Tablero[f][c] == null){
                Tablero[f][c] = new FichaFortaleza(2);
                FortalezasMordor ++;
            }
        }while(FortalezasMordor < 3);
        System.out.println("Coloque Fortalezas Mordor.");
    }

    
    
    //Colocar aleatoriamente por rangos.
    //Funcion para colocar rango 2.
    public void colocarGondorRango2(){
        int Gondor2 = 0;
        do{
            int f = rnd.nextInt(4-2)+2;
            int c = rnd.nextInt(9);
            if(Tablero[f][c] == null){
                Tablero[f][c] = new FichaRango2(1, "Caballeros de Rohan");
                Gondor2 ++;
            }
        }while(Gondor2 < 8);
        System.out.println("Rango 2 Gondor Colocado.");
    }
    
    public void colocarMordorRango2(){
        int Mordor2 = 0;
        do{
            int f = rnd.nextInt(8-6)+6;
            int c = rnd.nextInt(9);
            if(Tablero[f][c] == null){
                Tablero[f][c] = new FichaRango2(2, "Warg Rider");
                Mordor2 ++;
            }
        }while(Mordor2 < 8);
        System.out.println("Rango 2 Mordor Colocado.");
    }
    
    //Funcion para colocar rango 1.
    public void colocarGondorRango1(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango1(1,"Eowyn");
                colocadas ++;
            }
        }while(colocadas < 1);
        System.out.println("Listo");
    }
    public void colocarMordorRango1(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango1(2,"Grima Wartongue");
                colocadas ++;
            }
        }while(colocadas < 1);
        System.out.println("Listo");
    }
    
    //Funcion para colocar rango 3.
    public void colocarGondorRango3(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango3(1,"Soldados de Gondor");
                colocadas ++;
            }
        }while(colocadas < 5); 
        System.out.println("Listo");
    }
    
    public void colocarMordorRango3(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango3(2,"Orcos");
                colocadas ++;
            }
        }while(colocadas < 5);
        System.out.println("Listo");
    }
    
    //Funcion para colocar rango 4.
    public void colocarGondorRango4(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                if(colocadas < 1){
                    Tablero[f][c]= new FichaRango4(1,"Frodo");
                    colocadas ++;
                }else if(colocadas < 2){
                    Tablero[f][c]= new FichaRango4(1,"Sam");
                    colocadas ++;
                }else if(colocadas < 3){
                    Tablero[f][c]= new FichaRango4(1,"Merry");
                    colocadas ++;
                }else{
                    Tablero[f][c]= new FichaRango4(1,"Pippin");
                    colocadas ++;
                }
            }
        }while(colocadas < 4);
        System.out.println("Listo");
    }    
    
    public void colocarMordorRango4(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango4(2,"Haradrim");
                colocadas ++;  
            }
        }while(colocadas < 4);
        System.out.println("Listo");
    }
    
    //Funcion para colocar rango 5.
    public void colocarGondorRango5(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango5(1,"Elfos");
                colocadas ++;  
            }
        }while(colocadas < 4);
        System.out.println("Listo");
    }
    
    public void colocarMordorRango5(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango5(2,"Berserk");
                colocadas ++;  
            }
        }while(colocadas < 4);
        System.out.println("Listo");
    }
    
    //Funcion para colocar rango 6.
    public void colocarGondorRango6(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                if(colocadas < 1){
                    Tablero[f][c]= new FichaRango6(1,"Boromir");
                    colocadas ++;
                }else if(colocadas < 2){
                    Tablero[f][c]= new FichaRango6(1,"Arwen");
                    colocadas ++;
                }else if(colocadas < 3){
                    Tablero[f][c]= new FichaRango6(1,"Treebeard");
                    colocadas ++;
                }else{
                    Tablero[f][c]= new FichaRango6(1,"Haldir");
                    colocadas ++;
                }
            }
        }while(colocadas < 4);
        System.out.println("Listo");
    }
    
    public void colocarMordorRango6(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango6(2,"Uruk Hai");
                colocadas ++;  
            }
        }while(colocadas < 4);
        System.out.println("Listo");
    }
    
    //Funcion para colocar rango 7.
    public void colocarGondorRango7(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                if(colocadas < 1){
                    Tablero[f][c]= new FichaRango7(1,"Theoden");
                    colocadas ++;
                }else if(colocadas < 2){
                    Tablero[f][c]= new FichaRango7(1,"Eomer");
                    colocadas ++;
                }else{
                    Tablero[f][c]= new FichaRango7(1,"Faramir");
                    colocadas ++;
                }
            }
        }while(colocadas < 3);
        System.out.println("Listo");
    }
    
    public void colocarMordorRango7(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                if(colocadas < 1){
                    Tablero[f][c]= new FichaRango7(2,"Gothmog");
                    colocadas ++;
                }else if(colocadas < 2){
                    Tablero[f][c]= new FichaRango7(2,"Lurtz");
                    colocadas ++;
                }else{
                    Tablero[f][c]= new FichaRango7(2,"Sharku");
                    colocadas ++;
                }
            }
        }while(colocadas < 3);
        System.out.println("Listo");
    }
    
    //Funcion para colocar rango 8.
    public void colocarGondorRango8(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                if(colocadas < 1){
                    Tablero[f][c]= new FichaRango8(1,"Legolas");
                    colocadas ++;
                }else{
                    Tablero[f][c]= new FichaRango8(1,"Gimli");
                    colocadas ++;
                }
            }
        }while(colocadas < 2);
        System.out.println("Listo");
    }
    
    public void colocarMordorRango8(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango8(2,"Nazgul");
                colocadas ++;
            }
        }while(colocadas<2); 
        System.out.println("Listo");
    }
    
    //Funcion para colocar rango 9.
    public void colocarGondorRango9(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango9(1,"Aragon");
                colocadas ++;
            }
        }while(colocadas<1);
        System.out.println("Listo");
    }
    
    public void colocarMordorRango9(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango9(2,"Saruman");
                colocadas ++;
            }
        }while(colocadas<1);
        System.out.println("Listo");
    }
    
    //Funcion para colocar Rango 10.
    public void colocarGondorRango10(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(4);
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango10(1,"Gandalf");
                colocadas ++;
            }
        }while(colocadas<1);
        System.out.println("Listo");
    }
    
    public void colocarMordorRango10(){
        int colocadas =0;
        do{
            int f = rnd.nextInt(10-6)+6;
            int c = rnd.nextInt(10);
            if(Tablero[f][c]==null){
                Tablero[f][c]= new FichaRango10(2,"Witch King");
                colocadas ++;
            }
        }while(colocadas<1);
        System.out.println("Listo");
    }
    
    public void colocarFichasNullas(){
        for(int f = 4; f < 6;f ++){
            for(int c = 0; c <10; c ++){
                if(Tablero[f][c] == null){
                    Tablero[f][c]= new Ficha();
                }
            }
        }
    }
    
    
    //Funcion que ejecuta la construccion de un nuevo tablero.
    public void construirTablero(Tablero Game){
        //Reiniciar contadores.
        FortalezasMordor = 0;
        FortalezasGondor = 0;
        
        //Colocar Piezas.
        Game.colocarBanderas();
        Game.colocarFortalezasGondor();
        Game.colocarFortalezasMordor();
        Game.colocarGondorRango2();
        Game.colocarMordorRango2();
        Game.colocarGondorRango1();
        Game.colocarGondorRango3();
        Game.colocarGondorRango4();
        Game.colocarGondorRango5();
        Game.colocarGondorRango6();
        Game.colocarGondorRango7();
        Game.colocarGondorRango8();
        Game.colocarGondorRango9();
        Game.colocarGondorRango10();
        Game.colocarMordorRango1();
        Game.colocarMordorRango3();
        Game.colocarMordorRango4();
        Game.colocarMordorRango5();
        Game.colocarMordorRango6();
        Game.colocarMordorRango7();
        Game.colocarMordorRango8();
        Game.colocarMordorRango9();
        Game.colocarMordorRango10();
        Game.colocarFichasNullas();
        System.out.println("Listo para jugar.");
    }
    
}

