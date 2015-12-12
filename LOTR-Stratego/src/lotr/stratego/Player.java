/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import lotr.stratego.MenuPrincipal.MenuPrincipal;

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
    
    public static Player currentPlayer, secondPlayer;
    
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
    
    public void setPass(String pass){
        password = pass;
    }
    
    public static boolean validar(String user, String pass){
        for(Player player :Player.Usuarios) 
            
        if((user.equals(player.username)&&(pass.equals(player.password)))){
            currentPlayer = player;
            return true;
        }
            return false;
           
    }
    
    
    //Arraylist que contiene a los players.
    public static ArrayList<Player> Usuarios = new ArrayList<>();
}
