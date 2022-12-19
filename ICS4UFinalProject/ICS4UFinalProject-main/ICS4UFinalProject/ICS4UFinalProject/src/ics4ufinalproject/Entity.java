/*
 *B Cross, E Wilson, Y Zhang
 * Dec 15, 2022
 */
package ics4ufinalproject;

public interface Entity {

    public String getName();

    public void setName(String n);

    public int getHealth();

    public void setHealth(int h);

    public int getXPos();

    public int getYPos();

    public int getWidth();

    public int getHeight();

    public void setSize(int h, int w);

    public Attack getAttack(int i);

    public void setAttack(int i, Attack a);

    public void draw(int x, int y, int h, int w);

    public void move(int x, int y);

    public void impact(Attack a);
    
    public String toString();

}
