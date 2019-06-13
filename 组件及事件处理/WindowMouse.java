import javax.swing.*;
import java.awt.*;
public class WindowMouse extends JFrame{
	JTextField text;
	JButton button;
	JTextArea textArea;
	MousePolice police;
	PoliceListenDE listen;
	WindowMouse(){
		init();
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		textArea = new JTextArea(5,28);
		text = new JTextField(8);
		button = new JButton("°´Å¥");
		police = new MousePolice();
		police.setJTextArea(textArea);
		text.addMouseListener(police);
		button.addMouseListener(police);
		add(button);
		add(text);
		add(new JScrollPane(textArea));
		}							
}
	
		