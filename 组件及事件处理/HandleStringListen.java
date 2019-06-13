import java.awt.event.*;
public class HandleStringListen implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		System.out.println(str+"的长度:"+str.length());//接口回调
	}
}