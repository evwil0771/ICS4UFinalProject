/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4ufinalproject;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author yuzha3124
 */
public class Stars {
    private int x, y, z;
    
    public Stars(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void update(){
        int spd;
        if (z == 4){
            spd = 16;
        }else if (z == 3){
            spd = 14;
        }else if (z == 2){
            spd = 12;
        }else if (z == 1){
            spd = 10;
        }else{
            spd = 8;
        }
        y = y + spd;
        if (y > 710){
            y = -10;
        }
    }
    
    public void show(Graphics g2d){
        g2d.setColor(new Color(200 + (z*2), 200 + (z*2), 200 + (z*2)));
        g2d.fillOval(x, y, z + 2, 12);
    }
}
