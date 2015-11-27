/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichas;

import javax.swing.ImageIcon;

/**
 *
 * @author Roberto Melara
 */
public class FichaRango8 extends Ficha implements Movable{
    
    public FichaRango8(int f, String n) {
        faccion = f;
        rango = 8;
        if(f == 1){
            nombre = n;
            icono = new ImageIcon("Fichas/Gondor/"+ nombre +" (Custom).png");
            previa = new ImageIcon("Fichas/Gondor/"+ nombre +".png");
            
        }else{
            nombre = "Nazgul";
            icono = new ImageIcon("Fichas/Mordor/"+ nombre +" (Custom).png");
            previa = new ImageIcon("Fichas/Mordor/"+ nombre +".png");
        }
    }
    
    @Override
    public void mover(){}
}
