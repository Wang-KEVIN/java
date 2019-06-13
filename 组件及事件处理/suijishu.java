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
	JTextField 提示条,输入框;
	JButton nuttonGetNumber,buttonEnter;
	WindowButton(){
		setLayout(new FlowLayout());
		nuttonGetNumber =  new JButton("得到一个随机数");
		add(nuttonGetNumber);
		提示条 = new JTextField("输入你的猜测:",10);
		提示条.setEditable(false);
		输入框 = new JTextField("0",10);
		add(提示条);
		add(输入框);
		buttonEnter = new JButton("确认");
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
			提示条.setText("请输入你的猜想");
		}
		else if(e.getSource() == buttonEnter){
			int guess = 0;
			try{
				guess = Integer.parseInt(输入框.getText());
				if(guess==number){
					提示条.setText(guess+":猜对了");
				}
				if(guess>number){
					提示条.setText(guess+":猜大了");
					输入框.setText(null);
				}
				if(guess<number){
					提示条.setText(guess+":猜小了");
					输入框.setText(null);
				}
			}
			catch(NumberFormatException event){
				提示条.setText("请输入数字字符");
			}
		}
	}
}
		