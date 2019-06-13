import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class PoliceListenIE implements ItemListener{
	JComboBox choice;
	JTextArea textShow;
	public void setJComboBox(JComboBox box){
		choice = box;
	}	
	public void setJTextArea(JTextArea area){
		textShow = area;
	}
	public void itemStateChanged(ItemEvent e){		//接口回调处理
		textShow.setText(null);
		try{
			String fileName = choice.getSelectedItem().toString();//返回事件源
			File file = new File(fileName);
			FileReader inOne = new FileReader(file);	//字符读取流
			BufferedReader inTwo = new BufferedReader(inOne);	//缓冲流
			String s = null;
			while((s=inTwo.readLine())!=null){
				textShow.append(s+"\n");
			}
			inOne.close();
			inTwo.close();
		}
		catch(Exception ee){
			textShow.append(ee.toString());
		}
	}
}