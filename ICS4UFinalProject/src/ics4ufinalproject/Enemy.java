/*
 * B Cross, E Wilson, Y Zhang
 * Dec 16, 2022
 * Creates an enemy for the player to face against
 */
package ics4ufinalproject;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Enemy implements Entity{
    
    private int x;
    private int y;
    private int health;
    private String name;
    private int height;
    private int width;
    private ArrayList<Attack> attacks;
    private boolean boss;
    private boolean dead;
    private Image ship;

    /**
     * 
     * @param name
     * @param health
     * @param posX
     * @param posY
     * @param height
     * @param width
     * @param attack
     * @param boss 
     */
    public Enemy(String name, int health, int posX, int posY, int height, int width, Attack attack, boolean boss){
        this.name = name;
        this.health = health;
        x = posX;
        y = posY;
        this.height = height;
        this.width = width;
        attacks.add(attack);
        this.boss = boss;
        dead = false;
    }
    
    /**
     * 
     * @param name
     * @param health
     * @param posX
     * @param posY
     * @param height
     * @param width
     * @param attacks
     * @param boss 
     */
    public Enemy(String name, int health, int posX, int posY, int height, int width, ArrayList<Attack> attacks, boolean boss){
        this(name, health, posX, posY, height, width, attacks.get(0), boss);
        this.attacks = attacks;
    }
    
    /**
     * 
     * @return 
     */
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    /**
     * 
     * @return 
     */
    public int getHealth(){
        return health;
    }

    /**
     * 
     * @param h 
     */
    public void setHealth(int h){
        health = h;
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
    public int getWidth(){
        return width;
    }

    /**
     * 
     * @return 
     */
    public int getHeight(){
        return height;
    }

    /**
     * 
     * @param h
     * @param w 
     */
    public void setSize(int h, int w){
        height = h;
        width = w;
    }

    /**
     * 
     * @param i
     * @return 
     */
    public Attack getAttack(int i){
        return attacks.get(i);
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Attack> getAttacks(){
        return attacks;
    }
    
    /**
     * 
     * @param i
     * @param a 
     */
    public void setAttack(int i, Attack a){
        if(i >= attacks.size()){
            attacks.add(a);
        } else {
            attacks.set(i, a);
        }
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
    public boolean isBoss(){
        return boss;
    }
    
    /**
     * 
     * @param b 
     */
    public void setBoss(boolean b){
        boss = b;
    }
    
    /**
     * 
     * @param a 
     */
    public void impact(Attack a){
        health -= a.getDamage();
        if (health <= 0){
            dead = true;
        }
    }
    
    /**
     * 
     * @return 
     */
    public boolean isDead(){
        return dead;
    }
    
    /**
     * 
     * @param d 
     */
    public void setDead(boolean d){
        dead = d;
    }

    /**
     * 
     * @return 
     */
    public String toString(){
        String msg = "Name: " + name + "\nHealth: " + health + "\nHeight: " + height + "\nWidth: " + width;
        if (attacks.size() == 1){
            msg += "\nAttack:\n" + attacks.get(0).toString();
        } else {
            for (int i = 0; i < attacks.size(); i++){
                msg += "\nAttack " + (i+1) + ":\n" + attacks.get(i).toString();
            }
        }
        return msg;
    }
    
    /**
     * 
     * @return 
     */
    public Enemy clone(){
        Enemy e = new Enemy(name, health, x, y, height, width, attacks, boss);
        return e;
    }
    
    /**
     * 
     * @param e
     * @return 
     */
    public boolean equals(Enemy e){
        return e.isBoss() == boss && e.getName().equals(name) && e.getHealth() == health && e.getHeight() == height && e.getWidth() == width
                && e.getAttacks().equals(attacks);
    }
}
