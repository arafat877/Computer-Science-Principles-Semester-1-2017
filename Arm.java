import java.awt.*;
import javax.swing.JFrame;

public class Arm extends JFrame {

	public Arm() {
		init();
	}

	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}

	public void paint(Graphics g) {
		//forearm
		g.setColor(Color.BLACK);
		g.fillRect(300, 300, 200, 40);
		//elbow
		g.setColor(Color.BLACK);
		g.fillOval(260, 300, 50, 40);
		//arm
		g.setColor(Color.BLACK);
		g.fillRect(260, 110, 40, 200);
	}
}