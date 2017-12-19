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
		drawSquare(g);
		drawCircle(g);
		drawOOval(g);
		restTen();
		eraseOOval(g);
		eraseCircle(g);
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

	public void drawTTriangle(Graphics g){
		int[] xp = {400, 500, 600};
		int[] yp = {400, 200, 200};
		g.setColor(Color.BLACK);
		g.drawPolygon(xp, yp, 3);
	}

	public void eraseTTriangle(Graphics g){
		int[] xp = {400, 500, 600};
		int[] yp = {400, 200, 200};
		g.setColor(Color.WHITE);
		g.drawPolygon(xp, yp, 3);

	}

	public void drawSquare(Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(400, 200, 200, 200);
	}

	public void drawSQUARE(Graphics g, int num){
		for(int i = 0; i < num; i++){
			int k = 0;
			g.setColor(Color.BLACK);
			g.drawRect((int) (25 + time), (int) (25 + time), 100 + (k*100), 100 + (k*100));
			k++;

		}
	}

	public void eraseSQUARE(Graphics g, int num){
		for(int i = 0; i < num; i++){
			int k = 0;
			g.setColor(Color.WHITE);
			g.drawRect((int) (50 + time), (int) (50 + time), 100 + (k*100), 100 + (k*100));
			k++;

		}
	}

	public void drawSSquare(Graphics g){
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);
		g.setColor(Color.BLACK);
		g.drawRect((int) (xOfCircle * 100.0) + 200, (int) (yOfCircle * 100.0) + 200, (int) (xOfCircle * 100.0) + 100, (int) (yOfCircle * 100.0) + 100);
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

	public void drawOOval(Graphics g){
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);
		g.setColor(Color.BLACK);
		g.drawOval(100, 200, (int) (xOfCircle * 100.0) + 100, (int) (yOfCircle * 100.0));

	}
	public void eraseOOval(Graphics g){
		double xOfCircle = Math.cos(time);
		double yOfCircle = Math.sin(time);
		g.setColor(Color.WHITE);
		g.drawOval(100, 200, (int) (xOfCircle * 100.0) + 100, (int) (yOfCircle * 100.0));
	}

	public static void main(String[] args) {
		Arm k = new Arm();
		k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		k.setVisible(true);
	}
}