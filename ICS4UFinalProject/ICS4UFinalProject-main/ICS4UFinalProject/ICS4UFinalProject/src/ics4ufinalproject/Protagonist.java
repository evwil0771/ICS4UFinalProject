/*
 * B Cross, E Wilson, Y Zhang
 * Dec 15, 2022
 */
package ics4ufinalproject;

public class Protagonist implements Entity{
    
    private String name;
    private int health;
    private int x;
    private int y;
    private int height;
    private int width;
    private Attack attack;
    private boolean dead;
    
    public Protagonist(String name, int health, int posX, int posY, int height, int width, Attack attack){
        this.name = name;
        this. health = health;
        x = posX;
        y = posY;
        this.height = height;
        this.width = width;
        this.attack = attack;
        dead = false;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
    }

    public int getXPos() {
        return x;
    }

    public int getYPos() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setSize(int h, int w) {
        height = h;
        width = w;
    }

    public Attack getAttack(int i) {
        return attack;
    }

    public void setAttack(int i, Attack a) {
        attack = a;
    }

    public void draw(int x, int y, int h, int w){
        
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean isDead(){
        return dead;
    }
    
    public void setDead(boolean d){
        dead = d;
    }
    
    public void impact(Attack a){
        health -= a.getDamage();
        if (health <= 0){
            dead = true;
        }
    }
    
    public String toString(){
        String msg = "Name: " + name + "\nHealth: " + health + "\nHeight: " + height + "\nWidth: " + width + "\nAttack:\n" + attack.toString();
        return msg;
    }
    
    public Protagonist clone(){
        Protagonist p = new Protagonist(name, health, x, y, height, width, attack);
        return p;
    }
    
    public boolean equals(Protagonist p){
        return this.name.equals(p.getName()) && this.health == p.health && this.width == p.width && this.height == p.height
                && this.attack.equals(p.attack);
    }
}
