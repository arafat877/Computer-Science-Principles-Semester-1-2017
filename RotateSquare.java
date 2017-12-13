import java.awt.*;
import javax.swing.JFrame;

public class RotateSquare extends JFrame {

	double time, dt;

	public RotateSquare() {
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
		drawSquare(g);
		repaint();
	}

	public void incrementTime(){
		time += dt;
	}

	

	public void drawTriangle(Graphics g){
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);

		int[] xp = {(int)(xOfCircle * 100.0) + 200, 100 + 200, 100 + 200};
		int[] yp = {(int) (yOfCircle * 100.0) + 100, 50 + 100, 50 + 100};
		g.setColor(Color.BLACK);
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
	
	public void drawSquare(Graphics g){
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);

		int[] xp = {100, 200, 200, 100};
		int[] yp = {100, 200, 300, 300};
		g.setColor(Color.BLACK);
		g.drawPolygon(xp, yp, 4);
	}

	
	public void restTen(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		RotateSquare h = new RotateSquare();
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h.setVisible(true);

	}
}