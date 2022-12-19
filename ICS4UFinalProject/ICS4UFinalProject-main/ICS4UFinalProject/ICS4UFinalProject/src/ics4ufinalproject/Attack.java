/*
 * B Cross, E Wilson, Y Zhang
 * Dec 15, 2022
 */
package ics4ufinalproject;

import java.awt.Color;

public class Attack {
    
    private int damage;
    private int x;
    private int y;
    private Color c;
    
    public Attack(int damage, int xPos, int yPos, Color color){
        this.damage = damage;
        x = xPos;
        y = yPos;
        c = color;
    }
    
    public int getXPos(){
        return x;
    }
    
    public int getYPos(){
        return y;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public void setDamage(int d){
        damage = d;
    }
    
    public Color getColor(){
        return c;
    }
    
    public void setColor(Color c){
        this.c = c;
    }
    
    public void draw(){
        
    }
    
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        String msg = "Damage: " + damage + "\nColour: " + c;
        return msg;
    }
    
    public Attack clone(){
        Attack a =  new Attack(damage, x, y, c);
        return a;
    }
    
    public boolean equals(Attack a){
        return a.getDamage() == damage;
    }

}
