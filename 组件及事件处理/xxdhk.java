import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class xxdhk{
	public static void main(String args[]){
		WindowMess win = new WindowMess();
		win.setTitle("������Ϣ�Ի���Ĵ���");
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
		add(inputEnglish,BorderLayout.NORTH);	//����
		add(show,BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==inputEnglish){		//��ȡ����¼�Դ
			String str = inputEnglish.getText();
		if(str.matches(regex)){				//�ж�����
			show.append(str+",");
		}
		else{
			JOptionPane.showMessageDialog(this,"�����˷Ƿ��ַ�","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
			//����������Ϣ�Ի���
			inputEnglish.setText(null);
		}
	}
	}
}

