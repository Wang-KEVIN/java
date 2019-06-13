import java.util.Date;
import java.text.SimpleDateFormat;
class Home implements Runnable{
	int time = 0;
	SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
	Date date;
	public void run(){
		while(true){
			date = new Date();
			System.out.println(m.format(date));
			time++;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
			/*if(time==3){
				Thread thread = Thread.currentThread();//正在用CPU的线程
				thread = new Thread(this);
				thread.start();
			}*/
		}
	}
}

public class shijian{
	public static void main(String args[]){
		Home home = new Home();
		Thread showTime = new Thread(home);
		showTime.start();
	}
}