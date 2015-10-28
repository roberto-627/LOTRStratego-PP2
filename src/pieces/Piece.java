/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Andres
 */
public abstract class Piece extends JLabel{
    protected String color;
    
    public Piece(ImageIcon icon, String color){
        super(icon);
        this.color = color;
    }
    
    public Piece(ImageIcon icon){
        super(icon);
    }
    
    public abstract boolean validateMovement();

    public String getColor() {
        return color;
    }
}
