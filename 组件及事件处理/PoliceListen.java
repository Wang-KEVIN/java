import java.awt.event.*;
import javax.swing.*;
public class PoliceListen implements ActionListener{
	JTextField textInput;
	JTextArea textShow;
	public void setJTextField(JTextField text){
		textInput = text;
	}
	public void setJTextArea(JTextArea area){
		textShow = area;
	}
	public void actionPerformed(ActionEvent e){			//接口处理方法
		String str = textInput.getText();
		textShow.append(str+"的长度:"+str.length()+"\n");
	}
}