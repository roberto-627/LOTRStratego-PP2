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
public class FichaBandera extends Ficha{
    
    public FichaBandera(int f){
        faccion = f;
        rango = 100;
        if(f == 1){
            nombre = "Bandera Gondor";
            icono = new ImageIcon("Fichas/Gondor/BanderaGondor (Custom).png");
            previa = new ImageIcon("Fichas/Gondor/BanderaGondor.png");
            
        }else{
            nombre = "Bandera Mordor";
            icono = new ImageIcon("Fichas/Mordor/BanderaMordor (Custom).png");
            previa = new ImageIcon("Fichas/Mordor/BanderaMordor.png");
        }
    }
}
