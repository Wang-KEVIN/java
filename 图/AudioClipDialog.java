import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
import javax.swing.*;
public class AudioClipDialog extends JDialog implements Runnable,ItemListener,ActionListener{
	Thread thread;
	JComboBox choiceMusic;
	AudioClip clip;
	JButton buttonPlay,buttonLoop,buttonStop;
	String str;
	AudioClipDialog(){
		thread = new Thread(this);
		choiceMusic = new JComboBox();
		choiceMusic.addItem("选择音频文件");
		choiceMusic.addItem("C:\\Users\\Administrator\\Desktop\\代码\\javal\\图\\all falls down.wav");	//绝对路径+文件格式一定要符合(不是改个后缀名就行了)!!!
		choiceMusic.addItem("C:\\Users\\Administrator\\Desktop\\代码\\javal\\图\\somethingjustlikethat.wav");
		choiceMusic.addItem("C:\\Users\\Administrator\\Desktop\\代码\\javal\\图\\Stitches.wav");
		choiceMusic.addItemListener(this);
		buttonPlay = new JButton("播放");
		buttonLoop = new JButton("循环");
		buttonStop = new JButton("停止");
		buttonPlay.addActionListener(this);
		buttonLoop.addActionListener(this);
		buttonStop.addActionListener(this);
		setLayout(new FlowLayout());
		add(choiceMusic);
		add(buttonPlay);
		add(buttonLoop);
		add(buttonStop);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(333,122);
	}
	public void itemStateChanged(ItemEvent e){
		str = choiceMusic.getSelectedItem().toString();
		if(!(thread.isAlive())){
			thread = new Thread(this);
		}
		try{
			thread.start();
		}
		catch(Exception ee){}
	}

	public void run(){
		try{	
			File file = new File(str);
			URI uri = file.toURI();
			URL url = uri.toURL();
			clip = Applet.newAudioClip(url);
		}
	catch(Exception e){}
	}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==buttonPlay)
		clip.play();
	else if(e.getSource()==buttonLoop)
		clip.loop();
	else if(e.getSource()==buttonStop)
		clip.stop();
	}
}