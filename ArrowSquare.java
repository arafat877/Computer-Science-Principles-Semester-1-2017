import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;


public class ArrowSquare extends JFrame {
	double time, dt;

	public ArrowSquare() {
		init();
	}

	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		time = 0.0;
		dt = 0.1;
		repaint();
	}

	public void paint(Graphics g) {
		incrementTime();
		
		repaint();
		System.out.println(time);

	}

	public void incrementTime(){
		time += dt;
	}

	public void arrowFirstSquare(Graphics g, int x, int y){
		g.setColor(Color.BLACK);
		g.drawRect((int) (100 - (x * time)) + 200, (int) (100 - (y * time)) + 100, 100, 200);
	}

	public void eraseFirstSquare(Graphics g, int x, int y){
		g.setColor(Color.WHITE);
		g.drawRect((int) (100 - (x * time)) + 200, (int) (100 - (y * time)) + 100, 100, 200);
	}

	public void restTen(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void arrowSquare(Graphics g){
		arrowFirstSquare(g,1,0);
		restTen();
		eraseFirstSquare(g, 1,0);
	}
	
	public void keyPressed(KeyEvent e, Graphics g) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			arrowSquare(g);
			break;
		case KeyEvent.VK_DOWN:
			// down arrow
			break;
		case KeyEvent.VK_RIGHT:
			// right arrow
			break;
		case KeyEvent.VK_LEFT:
			// left arrow
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
