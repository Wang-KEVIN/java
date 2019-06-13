import java.net.*;
import java.util.*;
public class Receiver{
	public static void main(String args[]){
		int port = 5858;
		InetAddress group = null;
		MulticastSocket socket = null;
		try{
			group = InetAddress.getByName("239.255.8.0");
			socket = new MulticastSocket(port);
			socket.joinGroup(group);
		}
		catch(Exception e){}
		while(true){
		
				byte data[] = new byte[8192];
				DatagramPacket packet = null;
				packet = new DatagramPacket(data,data.length,group,port);//待接收的数据包
				try{
					socket.receive(packet);
					String message = new String(packet.getData(),0,packet.getLength());
					System.out.println("接收的内容:\n"+message);
				}
			
			catch(Exception e){}
		}
	}
}
			
