import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

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
		arrowSquare(g);
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
	

	public void arrowSquare(Graphics g){
		Scanner user_input = new Scanner(System.in);
		
		arrowFirstSquare(g,1,0);
		
		String input;
		System.out.print("Type:");
		input = user_input.next();
		
		System.out.println("Your name is: " + input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
