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
public class FichaFortaleza extends Ficha{
    
    public FichaFortaleza(int f){
        faccion = f;
        rango = 0;
        if(f == 1){
            nombre = "Fortaleza Gondor";
            icono = new ImageIcon("Fichas/Gondor/FortalezaGondor (Custom).png");
            previa = new ImageIcon("Fichas/Gondor/FortalezaGondor.png");
        }else{
            nombre = "Fortaleza Mordor";
            icono = new ImageIcon("Fichas/Mordor/Fortaleza (Custom).png");
            previa = new ImageIcon("Fichas/Mordor/Fortaleza.png");
        }
    }    
}
