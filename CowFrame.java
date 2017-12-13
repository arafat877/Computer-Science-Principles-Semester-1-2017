import java.awt.*;
import javax.swing.JFrame;

public class CowFrame extends JFrame {

	private final Color BISQUE = new Color(0xb59b6a);

	public CowFrame () {
		init();
	}

	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}

	public void paint(Graphics g) {
		g.setColor(BISQUE);
		g.fillRect(50, 100, 400, 200);
		g.setColor(BISQUE);
		g.fillOval(400, 30, 150, 150);
		g.setColor(Color.BLACK);
		g.fillRect(50, 300, 50, 100);
		g.setColor(Color.BLACK);
		g.fillRect(50, 350, 50, 100);
		g.setColor(Color.BLACK);
		g.fillOval(50, 400, 100, 50);
		g.setColor(Color.BLACK);
		g.fillRect(400, 300, 50, 100);
		g.setColor(Color.BLACK);
		g.fillRect(400, 350, 50, 100);
		g.setColor(Color.BLACK);
		g.fillOval(400, 400, 100, 50);
	}

	public static void main(String[] args) {
		CowFrame c = new CowFrame();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}

}