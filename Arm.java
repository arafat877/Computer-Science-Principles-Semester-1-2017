import java.awt.*;
import javax.swing.JFrame;

public class Arm extends JFrame {

	double time, dt;

	public Arm() {
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
		drawCircle(g);
		drawTriangle(g);
		restTen();
		eraseCircle(g);
		eraseTriangle(g);
		repaint();
	}

	public void incrementTime(){
		time += dt;
	}

	public void drawCircle(Graphics g){
		g.setColor(Color.BLACK);
		g.drawOval(300, 50, (int)(50+time), (int)(50+time));
	}

	public void drawTriangle(Graphics g){
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);
		
		int[] xp = {(int)(xOfCircle * 100.0) + 200, 100 + 200, 100 + 200};
		int[] yp = {(int) (yOfCircle * 100.0) + 100, 50 + 100, 50 + 100};
		g.drawPolygon(xp, yp, 3);
		
	}
	
	public void eraseTriangle(Graphics g){
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);
		
		int[] xp = {(int)(xOfCircle * 100.0) + 200, 100 + 200, 100 + 200};
		int[] yp = {(int) (yOfCircle * 100.0) + 100, 50 + 100, 50 + 100};
		g.setColor(Color.WHITE);
		g.drawPolygon(xp, yp, 3);
	}

		public void restTen(){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public void eraseCircle(Graphics g){
			g.setColor(Color.WHITE);
			g.drawOval(300, 50, (int)(50+time), (int)(50+time));

		}
	}