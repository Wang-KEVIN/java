import java.awt.*;
import javax.swing.*;
public class WinJD extends JFrame{
	JTextField text[] = new JTextField[3];
	PoliceJD police;
	JButton b;
	WinJD(){
		setLayout(new FlowLayout());
		police = new PoliceJD();
		for(int i =0;i<3;i++){
			text[i] = new JTextField(7);
			text[i].addKeyListener(police);	//键盘监视器
			text[i].addFocusListener(police);//焦点监视器
			add(text[i]);
		}
	b = new JButton("确定");
	add(b);
	text[0].requestFocusInWindow();
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 