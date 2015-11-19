/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Melara
 */
public class Player {
    //Atributos de cada player.
    String username;
    String password;
    int puntos;
    int partidas;
    int fuerzaBien;
    int fuerzaMal;
    ArrayList <String> Ultimos10;
    
    //Cosntructor de Players.
    public Player(String un, String pass){
        //Iniciaizacion de atributos.
        username = un;
        password = pass;
        puntos = 0;
        partidas = 0;
        fuerzaBien = 0;
        fuerzaMal = 0;
        Ultimos10 = new ArrayList<>();
    }
    
    public String getUser(){
        return username;
    }
    
    public String getPass(){
        return password;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    public int getPartidas(){
        return partidas;
    }
    
    
    //Arraylist que contiene a los players.
    public static ArrayList<Player> Usuarios = new ArrayList<>();
}
