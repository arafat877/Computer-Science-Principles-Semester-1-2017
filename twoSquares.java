import java.awt.*;
import javax.swing.JFrame;

public class twoSquares extends JFrame {

	double time, dt;

	public twoSquares() {
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
		noIntersect(g);
		yesIntersect(g);
		repaint();
		System.out.println(time);
		
	}

	public void incrementTime(){
		time += dt;
	}

	public void drawFirstRect(Graphics g, int action){
		g.setColor(Color.BLACK);
		g.drawRect((int) (100 + (action * time)) + 100, 100, 100, 200);
	}

	public void eraseFirstRect(Graphics g, int action){
		g.setColor(Color.WHITE);
		g.drawRect((int) (100 + (action * time)) + 100, 100, 100, 200);
	}
	public void drawSecRect(Graphics g, int action){
		g.setColor(Color.BLACK);
		g.drawRect((int) (100 - (action * time)) + 250, 100, 100, 200);
	}

	public void eraseSecRect(Graphics g, int action){
		g.setColor(Color.WHITE);
		g.drawRect((int) (100 - (action * time)) + 250, 100, 100, 200);
	}

	public void drawThirdRect(Graphics g, int action){
		g.setColor(Color.BLACK);
		g.drawRect((int) (100 + (action * time)) + 150, 100, 100, 200);
	}

	public void eraseThirdRect(Graphics g, int action){
		g.setColor(Color.WHITE);
		g.drawRect((int) (100 + (action * time)) + 150, 100, 100, 200);
	}
	public void drawFourthRect(Graphics g, int action){
		g.setColor(Color.BLACK);
		g.drawRect((int) (100 - (action * time)) + 200, 100, 100, 200);
	}

	public void eraseFourthRect(Graphics g, int action){
		g.setColor(Color.WHITE);
		g.drawRect((int) (100 - (action * time)) + 200, 100, 100, 200);
	}

	public void restTen(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void noIntersect(Graphics g){

		if(time < 25) {
			drawFirstRect(g, 1);
			drawSecRect(g, 1);
			restTen();
			eraseFirstRect(g,1);
			eraseSecRect(g, 1);

			if(time > 25){
				return;
			}
		}
	}

	public void yesIntersect(Graphics g){
		if(time > 25){
			drawThirdRect(g, -1);
			drawFourthRect(g, -1);
			restTen();
			eraseThirdRect(g, -1);
			eraseFourthRect(g, -1);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
