/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pieces;

import java.io.Serializable;
import javax.swing.ImageIcon;


/**
 *
 * @author Andres
 */
public class Pawn extends Piece implements Serializable{
    
    public Pawn(String color){
        super(new ImageIcon(color.equals("WHITE") ? "assets/pieces/pawn_w.png" : 
                "assets/pieces/pawn_b.png"), color);
    }

    @Override
    public boolean validateMovement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
