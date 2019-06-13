import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowActionEvent extends JFrame{
	JTextField inputText;
	JTextArea textShow;
	JButton button;
	PoliceListen listener;
	public WindowActionEvent(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		setLayout(new FlowLayout());
		inputText = new JTextField(10);
		button = new JButton("读取");
		textShow = new JTextArea(5,18);
		listener = new PoliceListen();
		listener.setJTextField(inputText);
		listener.setJTextArea(textShow);
		inputText.addActionListener(listener);		//inputText是事件源，listener是监视器
		button.addActionListener(listener);		//button是事件源,listner是监视器
		add(inputText);					//文本框获得输入焦点后，按回车，触发事件，对于注册了监视器的按钮，点击按钮，则触发事件
		add(button);
		add(new JScrollPane(textShow));
	}
}