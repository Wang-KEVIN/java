import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class xxdhk{
	public static void main(String args[]){
		WindowMess win = new WindowMess();
		win.setTitle("带有消息对话框的窗口");
		win.setBounds(80,90,200,330);
	}
}


class WindowMess extends JFrame implements ActionListener{
	JTextField inputEnglish;
	JTextArea show;
	String regex = "\\d+";
	WindowMess(){
		inputEnglish = new JTextField(22);
		inputEnglish.addActionListener(this);
		show = new JTextArea();		
		add(inputEnglish,BorderLayout.NORTH);	//布局
		add(show,BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==inputEnglish){		//获取鼠标事件源
			String str = inputEnglish.getText();
		if(str.matches(regex)){				//判断条件
			show.append(str+",");
		}
		else{
			JOptionPane.showMessageDialog(this,"输入了非法字符","消息对话框",JOptionPane.WARNING_MESSAGE);
			//弹出警告消息对话框
			inputEnglish.setText(null);
		}
	}
	}
}

