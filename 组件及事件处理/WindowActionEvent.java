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
		button = new JButton("��ȡ");
		textShow = new JTextArea(5,18);
		listener = new PoliceListen();
		listener.setJTextField(inputText);
		listener.setJTextArea(textShow);
		inputText.addActionListener(listener);		//inputText���¼�Դ��listener�Ǽ�����
		button.addActionListener(listener);		//button���¼�Դ,listner�Ǽ�����
		add(inputText);					//�ı��������뽹��󣬰��س��������¼�������ע���˼������İ�ť�������ť���򴥷��¼�
		add(button);
		add(new JScrollPane(textShow));
	}
}