import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class WindowDocument extends JFrame{
	JTextArea inputText,showText;
	PoliceListenDE listen;
	WindowDocument(){
		init();
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		inputText = new JTextArea(6,8);
		showText  = new JTextArea(6,8);
		add(new JScrollPane(inputText));	//��ӹ�������
		add(new JScrollPane(showText));
		listen = new PoliceListenDE();
		listen.setInputText(inputText);
		listen.setShowText(showText);
		(inputText.getDocument()).addDocumentListener(listen);	//�ı��������getDocument����������ά�����ĵ�
		}							//���ĵ�ע�������
}
	
		