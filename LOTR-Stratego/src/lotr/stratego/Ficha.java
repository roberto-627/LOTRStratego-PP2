/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotr.stratego;

import java.io.File;

/**
 *
 * @author Roberto Melara
 */
public class Ficha {    
    protected String nombre;
    protected int rango;
    protected File icono; 
    
    public class Gandalf extends Ficha{
        public Gandalf() {
            this.nombre = "Gandalf";
            this.rango = 10;
            this.icono = new File("SignUp.png");
        }
    }
} 

