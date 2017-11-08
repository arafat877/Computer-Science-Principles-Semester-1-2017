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
		time += dt;

		g.setColor(Color.BLACK);
		g.drawOval(350, (int)(50+time), 200, 100);

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		g.setColor(Color.WHITE);
		g.drawOval(350, (int)(50+time), 200, 100);

		repaint();
	}
}
