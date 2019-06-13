import java.awt.*;
import javax.swing.*;
import java.io.*;
public class WindowItemEvent extends JFrame{
	JComboBox choice;		//下拉列表
	JTextArea textShow;
	PoliceListenIE listener;
	public WindowItemEvent(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		setLayout(new FlowLayout());	//布局
		choice = new JComboBox();
		File dir = new File(".");	//目录
		
		FileAccept fileAccept = new FileAccept();
		fileAccept.setExtendName("java");	//条件筛选
		String [] fileName = dir.list(fileAccept);
		for(String name:fileName){
			choice.addItem(name);
		}
	textShow = new JTextArea(9,30);
	listener = new PoliceListenIE();
	listener.setJComboBox(choice);
	listener.setJTextArea(textShow);
	choice.addItemListener(listener);
	add(choice);
	add(new JScrollPane(textShow));
}

class FileAccept implements FilenameFilter{
	private String extendName;
	public void setExtendName(String s){
		extendName = "." + s;
	}
	public boolean accept(File dir,String name){
		return name.endsWith(extendName);
	}
}
}
	
		

	