import java.awt.event.*;
public class HandleStringListen implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		System.out.println(str+"�ĳ���:"+str.length());//�ӿڻص�
	}
}