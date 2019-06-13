import java.awt.*;
import javax.swing.*;
class Imagecanvas extends Canvas{
	Toolkit tool;
	Image image;
	Imagecanvas(){
		setSize(200,200);
		tool = getToolkit();
		image = tool.getImage("ok.jpg");
	}
	public void paint(Graphics g){
		g.drawImage(image,10,10,image.getWidth(this),image.getHeight(this),this);
	}
}

public class hztx{
	public static void main(String args[]){
		JFrame win = new JFrame();
		Toolkit tool = win.getToolkit();
		Image image = tool.getImage("t.jpg");
		win.setIconImage(image);
		win.setSize(400,400);
		win.add(new Imagecanvas());
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}
}