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

    public void setXPos(int x);

    public int getYPos();

    public void setYPos(int y);

    public int getWidth();

    public int getHeight();

    public void setSize(int h, int w);

    public Attack getAttack(int i);

    public void setAttack(int i, Attack a);

    abstract void draw(int x, int y, int h, int w);

    public void move(int x, int y);

    public String toString();

}
