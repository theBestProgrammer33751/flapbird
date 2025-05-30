package FlappyBird;

import FlappyBird.Bird; // Assuming your Bird class is in the same package
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // *** NEW: Import ActionListener ***
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class App extends JPanel implements ActionListener { // *** NEW: Implements ActionListener ***

	private Bird bird;
	private Timer gameTimer;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_LENGTH = 600;         
	Image background;
	
	public App() {
		bird = new Bird(WINDOW_WIDTH / 2 - 15, WINDOW_LENGTH / 2 - 15, 30, 30, 5, 15, Color.RED);
		this.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_LENGTH));
		background = new ImageIcon(getClass().getResource("/.flappyBirdBG.jpg")).getImage();
		this.setFocusable(true); // Ensures the panel can receive keyboard input

		this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {  
                if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                	System.out.println("jump");
                    bird.jump(); // Calls the jump method on your Bird object

                }
            }
            @Override                                                                       
            public void keyReleased(KeyEvent e) {
            	if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            		System.out.println("released");
            		bird.update();
            	}
            }
        });

		gameTimer = new Timer(45, this); // 'this' refers to this App object, now an ActionListener
		gameTimer.start(); 
	}

    private Color getImage(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call this first for proper Swing rendering
        bird.draw(g); 
    }

    @Override // *** NEW: This method is required by the ActionListener interface ***
    public void actionPerformed(ActionEvent e) {
        // This method is called repeatedly by the 'gameTimer' (every 20 milliseconds)
        bird.update();
        // In here, you will later add logic for:
        // - Moving pipes across the screen
        // - Checking for collisions between the bird and pipes/ground
        // - Updating the player's score
        // - Handling game over conditions
        if(bird.getY() < 0) {
        	bird.setY(0);
        	bird.setVelocity(0);
        }
        if(bird.getY() > 570) {
        	bird.setY(550);
        	bird.setVelocity(0);
        }
        repaint(); // Tells Swing to redraw the panel, which in turn calls paintComponent()
    }
   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird"); // Create the main window
        App gamePanel = new App(); // Create an instance of your game panel
        frame.add(gamePanel); // Add the game panel to the frame
        frame.pack(); // Sizes the frame to fit its contents
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application exits when closed
        frame.setLocationRelativeTo(null); // Centers the frame on the screen
        frame.setVisible(true); // Makes the frame visible
        gamePanel.requestFocusInWindow(); // Ensures the game panel has focus for keyboard input
    }
}