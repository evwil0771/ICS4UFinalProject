/*
 * B Cutten
    May 2022
    A class which allows drawing, because it extends JPanel, by way of the 
    Graphics2D class
    This panel is repainted regulary by implementing the Runnable interface and 
    running in a Thread. This allows it to be animated
 */
package ics4ufinalproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawingSurface extends JPanel implements MouseListener, Runnable {

    private Thread animator;
    private final int DELAY = 25;
    // default constructor

    public DrawingSurface() {
        this.addMouseListener(this);
        this.setFocusable(true);
        this.requestFocus();
    }

    //does the actual drawing
    private void doDrawing(Graphics g) {
        //the Graphics2D class is the class that handles all the drawing
        //must be casted from older Graphics class in order to have access to some newer methods
        Graphics2D g2d = (Graphics2D) g;

        background(g);
    }

    //overrides paintComponent in JPanel class
    //performs custom painting
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//does the necessary work to prepare the panel for drawing
        doDrawing(g);
    }

    //update the position of the ball
    //(we could do more complex game updates here)
    //this method is called after the JPanel is added to the JFrame
    //we can perform start up tasks here
    @Override
    public void addNotify() {
        super.addNotify();

        animator = new Thread(this);
        animator.start();
        for (int i = 0; i < 100; i++) {//create an arraylist of new star object
            a[i] = new Stars(randomNum(0, 1000), randomNum(-1000, 0), randomNum(0, 4));
        }
    }

    Stars[] a = new Stars[100];
    
    public void background(Graphics g2d) {
        g2d.setColor(new Color(0, 0, 0));
        g2d.fillRect(0, 0, 1000, 700);
        g2d.setColor(new Color(200, 200, 200));

        for (int i = 0; i < 100; i++) {
            a[i].show(g2d);
            a[i].update();
        }
    }

    public void character(Graphics g2d) {
        g2d.setColor(new Color(255, 255, 255));
        g2d.fillRect(0, 0, 50, 50);
    }

    /**
     * Generate a random number in a range
     *
     * @param min minimum value
     * @param max maximum value
     * @return random number in range
     */
    private int randomNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    //this method is called only once, when the Thread starts
    @Override
    public void run() {

        long beforeTime, timeDiff, sleep;
        //get the current time
        beforeTime = System.currentTimeMillis();

        while (true) { //this loop runs once ever 25 ms (the DELAY)
            //redraws the screen (calling the paint component method)
            repaint();

            //calculate how much time has passed since the last call
            //this allows smooth updates and our ball will move at a constant speed (as opposed to being dependent on processor availability)
            timeDiff = System.currentTimeMillis() - beforeTime;

            //calculate how much time to wait before the next call
            sleep = DELAY - timeDiff;

            //always wait at least 2 ms
            if (sleep < 0) {
                sleep = 2;
            }

            //try to actually wait
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                //threads can be interrupted from other threads
                JOptionPane.showMessageDialog(this, "Thread interrupted: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            //get the new current time
            beforeTime = System.currentTimeMillis();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyPressed(KeyEvent e, Protagonist player, Attack deafult) {
        //spawn();
        //WASD
        if (e.getKeyChar() == 'a') {
            player.move(player.getXPos() - 1, 0);
        } else if (e.getKeyChar() == 'd') {
            player.move(player.getXPos() + 1, 0);
        }
        //Arrow keys
        if (e.getKeyCode() == 37) {
            player.move(player.getXPos() - 1, 0);
        } else if (e.getKeyCode() == 39) {
            player.move(player.getXPos() - 1, 0);
        }
    }
/*
    public void spawn() {
        Attack deafult = new Attack(10, 0, 0, Color.RED);
        Protagonist player = new Protagonist("player", 100, 50, 180, 5, 5, deafult);
        deafult.move(player.getXPos(), player.getYPos());
    }
*/
}
