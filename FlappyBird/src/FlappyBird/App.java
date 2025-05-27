package FlappyBird;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class App extends JPanel  {
	private static Graphics graphics;
	private Bird bird;
	private Timer gameTimer;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_LENGTH = 600;
	public App() {
		
		
		bird = new bird(WINDOW.WIDTH/2-15,WINDOW.HEIGHT/2-15,30,30,0.9,0.5, Color.RED);
		
		
	}
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args){
    JFrame frame = new JFrame("Flappy Bird");
    frame.setSize(400, 600);
    frame.setVisible(true);
    frame.setLocationRelativeTo(frame);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    paintBird(graphics);
  }*/

  /*public static void paintBird(Graphics g) {
    Bird bird = new Bird(200, 300, 20, 20, 0.9, 0.5, Color.RED);
    bird.draw(g);
  }*/
}