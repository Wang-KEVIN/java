import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class zdydhk{
	public static void main(String args[]){
		Windowzdy win = new Windowzdy();
		win.setTitle("带自定义对话框的窗口");
		win.setSize(200,300);
	}
}

class Windowzdy extends JFrame implements ActionListener{
	JButton button;
	MyDialog dialog;
	Windowzdy(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		button = new JButton("打开对话框");
		button.addActionListener(this);
		add(button,BorderLayout.NORTH);
		dialog = new MyDialog(this,"我是对话框");
		dialog.setModal(true);
	}
	public void actionPerformed(ActionEvent e){
		dialog.setVisible(true);
		String str = dialog.getTitle();
		setTitle(str);
		}	
	}


class MyDialog extends JDialog implements ActionListener{
	JTextField inputTitle;
	String title;
	MyDialog(JFrame f,String s){
		super(f,s);
		inputTitle = new JTextField(10);
		inputTitle.addActionListener(this);
		setLayout(new FlowLayout());
		add(new JLabel("输入窗口的新标题"));
		add(inputTitle);
		setBounds(100,100,100,100);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		title = inputTitle.getText();
		setVisible(false);
	}
	public String getTitle(){
		return title;
	}
}