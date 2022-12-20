/*
 * B Cross, E Wilson, Y Zhang
 * Dec 16, 2022
 */
package ics4ufinalproject;

import java.util.ArrayList;

public class Enemy implements Entity{
    
    private int x;
    private int y;
    private int health;
    private String name;
    private int height;
    private int width;
    private ArrayList<Attack> attacks;
    private boolean boss;

    public Enemy(String name, int health, int posX, int posY, int height, int width, Attack attack, boolean boss){
        this.name = name;
        this.health = health;
        x = posX;
        y = posY;
        this.height = height;
        this.width = width;
        attacks.add(attack);
        this.boss = boss;
    }
    
    public Enemy(String name, int health, int posX, int posY, int height, int width, ArrayList<Attack> attacks, boolean boss){
        this(name, health, posX, posY, height, width, attacks.get(0), boss);
        this.attacks = attacks;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int h){
        health = h;
    }

    public int getXPos(){
        return x;
    }

    public int getYPos(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setSize(int h, int w){
        height = h;
        width = w;
    }

    public Attack getAttack(int i){
        return attacks.get(i);
    }
    
    public ArrayList<Attack> getAttacks(){
        return attacks;
    }
    
    public void setAttack(int i, Attack a){
        if(i >= attacks.size()){
            attacks.add(a);
        } else {
            attacks.set(i, a);
        }
    }

    public void draw(int x, int y, int h, int w){
        
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public boolean isBoss(){
        return boss;
    }
    
    public void setBoss(boolean b){
        boss = b;
    }

    public String toString(){
        String msg = "";
        return msg;
    }
    
    public Enemy clone(){
        Enemy e = new Enemy(name, health, x, y, height, width, attacks, boss);
        return e;
    }
    
    public boolean equals(Enemy e){
        return e.isBoss() == boss && e.getName().equals(name) && e.getHealth() == health && e.getHeight() == height && e.getWidth() == width
                && e.getAttacks().equals(attacks);
    }

    @Override
    public void setXPos(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setYPos(int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
