import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlSquare extends JPanel implements KeyListener{
    int x = 250; 
    int y = 250;

    
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed:");
    }
    
    public void keyReleased(KeyEvent e) {
    	System.out.println("Key Released");
    }

    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            System.out.println("Down");
            y = y + 2;

            repaint();
        }
        
        if(e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("Up");
            y = y - 2;

            repaint();
        }
        
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("Right");
            x = x + 2;

            repaint();
        }
        
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("left");
            x = x - 2;

            repaint();
        }
    }

    public void paint(Graphics g){
    	super.paint(g);//you should always call the super-method first

        g.setColor(Color.BLACK);
        g.drawRect(x ,y,100,100);
        
        repaint();
    }

    public static void main(String[] args){

        ControlSquare controlsquare = new ControlSquare();
        JFrame f = new JFrame();

        f.setVisible(true);
        f.setSize(700,700);
        controlsquare.setBackground(Color.WHITE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(controlsquare);
        f.add(controlsquare);
        f.repaint();           
    }
}