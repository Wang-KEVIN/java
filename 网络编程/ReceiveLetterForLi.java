import java.net.*;
public class ReceiveLetterForLi implements Runnable{
	public void run(){
		DatagramPacket pack = null;
		DatagramSocket postman = null;
		byte data[] = new byte[8192];
		try{
			pack = new DatagramPacket(data,data.length);
			postman = new DatagramSocket(666);
		}
		catch(Exception e){System.out.println("设置接口错误");}
		while(true){
			if(postman==null) {System.out.println("没有收到信息");break;}
			else
				try{
					postman.receive(pack);
					String message = new String(pack.getData(),0,pack.getLength());
					System.out.printf("收到张三的信息%25s\n",message);
				}
			catch(Exception e){System.out.println("接收错误"+e);}
		}
	}
} 