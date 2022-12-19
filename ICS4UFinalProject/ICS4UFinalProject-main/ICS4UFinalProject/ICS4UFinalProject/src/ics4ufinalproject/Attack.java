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
    
    /**
     * 
     * @param damage
     * @param xPos
     * @param yPos
     * @param color 
     */
    public Attack(int damage, int xPos, int yPos, Color color){
        this.damage = damage;
        x = xPos;
        y = yPos;
        c = color;
    }
    
    /**
     * 
     * @return 
     */
    public int getXPos(){
        return x;
    }
    
    /**
     * 
     * @return 
     */
    public int getYPos(){
        return y;
    }
    
    /**
     * 
     * @return 
     */
    public int getDamage(){
        return damage;
    }
    
    /**
     * 
     * @param d 
     */
    public void setDamage(int d){
        damage = d;
    }
    
    /**
     * 
     * @return 
     */
    public Color getColor(){
        return c;
    }
    
    /**
     * 
     * @param c 
     */
    public void setColor(Color c){
        this.c = c;
    }
    
    /**
     * 
     */
    public void draw(){
        
    }
    
    /**
     * 
     * @param x
     * @param y 
     */
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * 
     * @return 
     */
    public String toString(){
        String msg = " Damage: " + damage + "\nColour: " + c;
        return msg;
    }
    
    /**
     * 
     * @return 
     */
    public Attack clone(){
        Attack a =  new Attack(damage, x, y, c);
        return a;
    }
    
    /**
     * 
     * @param a
     * @return 
     */
    public boolean equals(Attack a){
        return a.getDamage() == damage;
    }

}
