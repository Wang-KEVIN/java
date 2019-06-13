import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class bhMyCanvs extends JPanel{
	public void paint(Graphics g){
		Graphics2D g_2d = (Graphics2D)g;
		String s = "Hello";
		Ellipse2D ellipse = new Ellipse2D.Double(30,30,80,30);
		AffineTransform trans = new AffineTransform();
		for(int i=1;i<=24;i++){
			trans.rotate(15.0*Math.PI/180,70,45);
			g_2d.setTransform(trans);
			g_2d.draw(ellipse);
		}
		for(int i=1;i<=12;i++){
			trans.rotate(30.0*Math.PI/180,60,160);
			g_2d.setTransform(trans);
			g_2d.drawString(s,60,160);
		}
	}
}

public class bhtx{
	public static void main(String args[]){
		JFrame win = new JFrame();
		win.setSize(400,400);
		win.add(new bhMyCanvs());
		win.setVisible(true);
	}
}