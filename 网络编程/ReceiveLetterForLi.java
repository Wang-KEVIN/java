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
		catch(Exception e){System.out.println("���ýӿڴ���");}
		while(true){
			if(postman==null) {System.out.println("û���յ���Ϣ");break;}
			else
				try{
					postman.receive(pack);
					String message = new String(pack.getData(),0,pack.getLength());
					System.out.printf("�յ���������Ϣ%25s\n",message);
				}
			catch(Exception e){System.out.println("���մ���"+e);}
		}
	}
} 