import java.net.*;
import java.util.*;
public class LISI{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Thread readData;
		ReceiveLetterForLi receiver = new ReceiveLetterForLi();
		try{
			readData = new Thread(receiver);
			readData.start();
			byte[] buffer =  new byte[1];
			InetAddress address = InetAddress.getByName("127.0.0.1");
			DatagramPacket dataPack = new DatagramPacket(buffer,buffer.length,address,888);
			DatagramSocket postman = new DatagramSocket();
			System.out.println("���뷢�͸���������Ϣ:");
			while(scanner.hasNext()){
				String mess = scanner.nextLine();
				buffer = mess.getBytes();
				if(mess.length()==0)
					System.exit(0);
				buffer =  mess.getBytes();
				dataPack.setData(buffer);
				postman.send(dataPack);
				System.out.println("�������뷢�͸���������Ϣ:");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}