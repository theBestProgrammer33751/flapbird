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
public class Bird {

  private int x;
  private int y;
  private int width;
  private int height;
  private double velocity;
  private double gravity;
  private double lift;
  private Color color;
  private Rectangle hitBox;

  public Bird(int x, int y, int width, int height, int gravity, int lift, Color color) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.color = color;
    this.gravity = gravity;
    this.lift = lift;
    velocity = 0;
    hitBox = new Rectangle(x, y, width, height);
    //hitBox.setBounds(x, y, width, height);
  }

  public void update() {
    velocity += gravity;
    
    if(velocity > 10) {
      velocity = 10;
    }
    y += velocity;
    hitBox.y = y;
  }

  public void jump() {
    gravity -= lift;
    velocity = gravity;
    if(velocity < -10) {
      velocity = -10;
    }
  }
  public void draw(Graphics g) {
    g.setColor(color);
    g.fillRect(x, y, width, height);
  }

  public void setX(int x) {
    this.x = x;
  }
  public void setY(int y) {
    this.y = y;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }
  
}