import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class qrdhk{
	public static void main(String args[]){
		WindowEnter win = new WindowEnter();
		win.setTitle("������Ի���Ĵ���");
		win.setBounds(100,100,200,300);
	}
}

class WindowEnter extends JFrame implements ActionListener{
	JTextArea save;
	JTextField inputName;
	WindowEnter(){
		inputName = new JTextField(22);
		inputName.addActionListener(this);
		save = new JTextArea();
		add(inputName,BorderLayout.NORTH);
		add(new JScrollPane(save),BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String s = inputName.getText();
		int n = JOptionPane.showConfirmDialog(this,"ȷ���Ƿ���ȷ","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.NO_OPTION){
			inputName.setText(null);
		}
		else if(n==JOptionPane.YES_OPTION){
			save.append(s+"\n");
		}
	}
}