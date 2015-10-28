/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pieces.*;

/**
 *
 * @author Andres
 */
public class Board {
    public static void main(String[] args) {
        JFrame window = new JFrame("TEST");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450, 450);
        
        JPanel board = new JPanel();
        board.setLayout(null);
        
        board.add(new Pawn("WHITE")).setBounds(100, 50, 50, 50);
        board.getComponent(0);
        window.add(board);
        
        
        window.setVisible(true);
        
    }
}
