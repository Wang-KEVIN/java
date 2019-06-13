import java.awt.event.*;
import javax.swing.*;
public class PoliceJD  implements KeyListener,FocusListener{	//表面看起来一样，实则不一样！PoliceJD
	public void keyPressed(KeyEvent e){
		JTextField t = (JTextField)e.getSource();
		if(t.getCaretPosition()>=6)
			t.transferFocus();
		}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	public void focusGained(FocusEvent e){
		JTextField text = (JTextField)e.getSource();
		text.setText(null);
	}
	public void focusLost(FocusEvent e){}
}