import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class srdhk{
	public static void main(String args[]){
		WindowInput win = new WindowInput();
		win.setTitle("������Ի���Ĵ���");
		win.setBounds(100,100,200,300);
	}
}

class WindowInput extends JFrame implements ActionListener{
	JTextArea showResult;
	JButton openInput;
	WindowInput(){
		openInput = new JButton("��������Ի���");
		showResult = new JTextArea();
		add(openInput,BorderLayout.NORTH);
		add(new JScrollPane(showResult),BorderLayout.CENTER);
		openInput.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String str = JOptionPane.showInputDialog(this,"����һ����","����Ի���",JOptionPane.PLAIN_MESSAGE);
		if(str!=null){
			try{
				double number = Double.parseDouble(str);
				double r = number*number;
				showResult.append(number + "��ƽ���ǣ�"+r+"\n");
		}
		catch(Exception exp){}
	}
	}
}