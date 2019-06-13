import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class qctx{
	public static void main(String args[]){
		JFrame win = new JFrame();
		win.setSize(400,400);
		win.add(new qcMyCanvas());
		win.setVisible(true);
	}
}

class qcMyCanvas extends Canvas{
	int i = 1;
	public void paint(Graphics g){
		Graphics2D g_2d = (Graphics2D)g;
		i = (i+2)%360;
		g.fillArc(30,50,120,100,i,2);
		g.fillArc(30,152,120,100,i,2);
		try{
			Thread.sleep(300);
			}
		catch(InterruptedException e){}
		repaint();
		}
	public void update(Graphics g){
		g.clearRect(30,152,120,100);
		paint(g);
	}
}