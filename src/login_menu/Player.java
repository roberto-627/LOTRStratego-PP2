
package login_menu;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Player {
    private String username, password;
    private int points;
    public static ArrayList<Player> players = new ArrayList<>();
    
    
    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 0;
    }   

   

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPoints() {
        return points;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPoints(int points) {
        this.points = points;
    }  

    @Override
    public String toString() {
        return "Player{" + "Username=" + username + "\nPoints=" + points + "\nCantidad de Partidas Pendientes= 1" + '}';
    }
    /*
    *Funcion recursiva que retorna un objeto de tipo Player. Se ingresa el
    *usuario de parametro y si existe retorna el objeto con ese usuario; caso
    *contrario retorna null.
    */
    private static Player findPlayer(String username, int i){
        if(i < players.size()){
            if(players.get(i).getUsername().equals(username))
                return players.get(i);
            return findPlayer(username, i+1);
        }
        return null;
    }
    /*
    *Funcion auxiliar de findPlayer.
    */
    public static Player findPlayer(String username){
        return findPlayer(username, 0);
    }
    /*
    *Funcion que verifica que verifica que el usuario y contraseña enviados de
    *parametro sean los mismos atributos de un mismo objeto; retorna true. 
    *Caso contrario se muestra cual fue el problema y se retorna false.
    */
    public static boolean authenticatePlayer(String username, String password){
       Player player = findPlayer(username);
       if(player != null){
           if(player.getPassword().equals(password)){
                LoginMenu.currentPlayer = player;
               return true;
           }else{
               JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);             
               return false;
           }
       }
       JOptionPane.showMessageDialog(null, "Usuario no existe.", "Error", JOptionPane.ERROR_MESSAGE);
       return false;
    }
    
}
