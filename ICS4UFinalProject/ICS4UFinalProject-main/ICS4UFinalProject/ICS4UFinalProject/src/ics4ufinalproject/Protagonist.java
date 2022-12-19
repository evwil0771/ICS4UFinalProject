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
    
    /**
     * 
     * @param name
     * @param health
     * @param posX
     * @param posY
     * @param height
     * @param width
     * @param attack 
     */
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
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param n 
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * 
     * @return 
     */
    public int getHealth() {
        return health;
    }

    /**
     * 
     * @param h 
     */
    public void setHealth(int h) {
        health = h;
    }

    /**
     * 
     * @return 
     */
    public int getXPos() {
        return x;
    }

    /**
     * 
     * @return 
     */
    public int getYPos() {
        return y;
    }

    /**
     * 
     * @return 
     */
    public int getWidth() {
        return width;
    }

    /**
     * 
     * @return 
     */
    public int getHeight() {
        return height;
    }

    /**
     * 
     * @param h
     * @param w 
     */
    public void setSize(int h, int w) {
        height = h;
        width = w;
    }

    /**
     * 
     * @param i
     * @return 
     */
    public Attack getAttack(int i) {
        return attack;
    }

    /**
     * 
     * @param i
     * @param a 
     */
    public void setAttack(int i, Attack a) {
        attack = a;
    }

    /**
     * 
     * @param x
     * @param y
     * @param h
     * @param w 
     */
    public void draw(int x, int y, int h, int w){
        
    }

    /**
     * 
     * @param x
     * @param y 
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
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
    public String toString(){
        String msg = "Name: " + name + "\nHealth: " + health + "\nHeight: " + height + "\nWidth: " + width + "\nAttack: " + attack.toString();
        return msg;
    }
    
    /**
     * 
     * @return 
     */
    public Protagonist clone(){
        Protagonist p = new Protagonist(name, health, x, y, height, width, attack);
        return p;
    }
    
    /**
     * 
     * @param p
     * @return 
     */
    public boolean equals(Protagonist p){
        return this.name.equals(p.getName()) && this.health == p.health && this.width == p.width && this.height == p.height
                && this.attack.equals(p.attack);
    }
}
