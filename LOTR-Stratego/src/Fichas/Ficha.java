/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichas;

import javax.swing.ImageIcon;

/*
 * @author Roberto Melara
 */

public class Ficha{    
    protected String nombre;
    protected int rango;
    protected ImageIcon icono = new ImageIcon("Fichas/Vacio.png");
    protected ImageIcon previa;
    protected int faccion;
    
    public ImageIcon getIcono(){
        return icono;
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getRango() {
        return rango;
    }

    public ImageIcon getPrevia() {
        return previa;
    }

    public int getFaccion() {
        return faccion;
    }
    
    
} 

