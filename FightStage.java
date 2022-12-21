/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4ufinalproject;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class FightStage extends JFrame{
    
    MainMenu firstWindow;
    
    /**
     * creates new form second window
     * @param m - main window
     */
    public FightStage(MainMenu m) {
        //create the User interface
        initUI();
        firstWindow = m;
    }

    //create the custom JFrame
    private void initUI() {        
        //set title of the JFrame
        setTitle("Stage");
        //add a custom JPanel to draw on
        add(new DrawingSurface());
        //set the size of the window
        setSize(1000, 700);
        //tell the JFrame what to do when closed
        //this is important if our application has multiple windows
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}
