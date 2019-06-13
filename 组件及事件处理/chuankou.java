import javax.swing.*;
import java.awt.*;
public class chuankou{
	public static void main(String args[]){
		JFrame window1 = new JFrame("第一个窗口");
		JFrame window2 = new JFrame("第二个窗口");
		Container con = window1.getContentPane();
		con.setBackground(Color.yellow);
		window1.setBounds(60,100,199,100);
		window2.setBounds(160,200,199,300);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window2.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}