import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class suijishu{
	public static void main(String args[]){
		WindowButton win = new WindowButton();
	}
}

class WindowButton extends JFrame implements ActionListener{
	int number;
	JTextField ��ʾ��,�����;
	JButton nuttonGetNumber,buttonEnter;
	WindowButton(){
		setLayout(new FlowLayout());
		nuttonGetNumber =  new JButton("�õ�һ�������");
		add(nuttonGetNumber);
		��ʾ�� = new JTextField("������Ĳ²�:",10);
		��ʾ��.setEditable(false);
		����� = new JTextField("0",10);
		add(��ʾ��);
		add(�����);
		buttonEnter = new JButton("ȷ��");
		add(buttonEnter);
		buttonEnter.addActionListener(this);
		nuttonGetNumber.addActionListener(this);
		setBounds(100,100,150,150);
		setVisible(true);
		validate();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == nuttonGetNumber){
			number = (int)(Math.random()*100) + 1;
			��ʾ��.setText("��������Ĳ���");
		}
		else if(e.getSource() == buttonEnter){
			int guess = 0;
			try{
				guess = Integer.parseInt(�����.getText());
				if(guess==number){
					��ʾ��.setText(guess+":�¶���");
				}
				if(guess>number){
					��ʾ��.setText(guess+":�´���");
					�����.setText(null);
				}
				if(guess<number){
					��ʾ��.setText(guess+":��С��");
					�����.setText(null);
				}
			}
			catch(NumberFormatException event){
				��ʾ��.setText("�����������ַ�");
			}
		}
	}
}
		