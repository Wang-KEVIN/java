import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class srdhk{
	public static void main(String args[]){
		WindowInput win = new WindowInput();
		win.setTitle("带输入对话框的窗口");
		win.setBounds(100,100,200,300);
	}
}

class WindowInput extends JFrame implements ActionListener{
	JTextArea showResult;
	JButton openInput;
	WindowInput(){
		openInput = new JButton("弹出输入对话框");
		showResult = new JTextArea();
		add(openInput,BorderLayout.NORTH);
		add(new JScrollPane(showResult),BorderLayout.CENTER);
		openInput.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String str = JOptionPane.showInputDialog(this,"输入一个数","输入对话框",JOptionPane.PLAIN_MESSAGE);
		if(str!=null){
			try{
				double number = Double.parseDouble(str);
				double r = number*number;
				showResult.append(number + "的平方是："+r+"\n");
		}
		catch(Exception exp){}
	}
	}
}