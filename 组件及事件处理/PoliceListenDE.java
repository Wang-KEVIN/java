import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class PoliceListenDE implements DocumentListener{
	JTextArea inputText,showText;
	public void setInputText(JTextArea text){
		inputText = text;
	}
	public void setShowText(JTextArea text){
		showText = text;
	}
	public void changedUpdate(DocumentEvent e){
		String str = inputText.getText();
		String regex = "[\\s\\d\\p{Punct}]+";//¿Õ¸ñ¡¢Êý×ÖºÍ·ûºÏ
		String words[] = str.split(regex);
		Arrays.sort(words);	//×ÖµäË³Ðò
		showText.setText(null);
		for(String s:words)
			showText.append(s+",");
		}
	public void removeUpdate(DocumentEvent e){
		changedUpdate(e);
	}
	public void insertUpdate(DocumentEvent e){
		changedUpdate(e);
	}
}