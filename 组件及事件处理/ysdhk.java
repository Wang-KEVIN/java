import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ysdhk{
	public static void main(String args[]){
		WindowColor win = new WindowColor();
		win.setTitle("����ɫ�Ի���Ĵ���");
		win.setBounds(100,100,200,300);
	}
}

class WindowColor extends JFrame implements ActionListener{
	JButton button;
	WindowColor(){
		button = new JButton("����ɫ�Ի���");
		button.addActionListener(this);
		setLayout(new FlowLayout());
		add(button);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		Color newColor = JColorChooser.showDialog(this,"��ɫ��",getContentPane().getBackground());
		if(newColor!=null){
			getContentPane().setBackground(newColor);
		}	
	}
}