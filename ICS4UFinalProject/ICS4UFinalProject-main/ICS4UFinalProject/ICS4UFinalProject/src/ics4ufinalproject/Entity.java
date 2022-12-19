/*
 *B Cross, E Wilson, Y Zhang
 * Dec 15, 2022
 */
package ics4ufinalproject;

public interface Entity {

    /**
     * 
     * @return 
     */
    public String getName();

    /**
     * 
     * @param n 
     */
    public void setName(String n);

    /**
     * 
     * @return 
     */
    public int getHealth();

    /**
     * 
     * @param h 
     */
    public void setHealth(int h);

    /**
     * 
     * @return 
     */
    public int getXPos();

    /**
     * 
     * @return 
     */
    public int getYPos();

    /**
     * 
     * @return 
     */
    public int getWidth();

    /**
     * 
     * @return 
     */
    public int getHeight();

    /**
     * 
     * @param h
     * @param w 
     */
    public void setSize(int h, int w);

    /**
     * 
     * @param i
     * @return 
     */
    public Attack getAttack(int i);

    /**
     * 
     * @param i
     * @param a 
     */
    public void setAttack(int i, Attack a);

    /**
     * 
     * @param x
     * @param y
     * @param h
     * @param w 
     */
    public void draw(int x, int y, int h, int w);

    /**
     * 
     * @param x
     * @param y 
     */
    public void move(int x, int y);

    /**
     * 
     * @param a 
     */
    public void impact(Attack a);
    
    /**
     * 
     * @return 
     */
    public boolean isDead();
    
    /**
     * 
     * @param d 
     */
    public void setDead(boolean d);

    /**
     * 
     * @return 
     */
    public String toString();

}
