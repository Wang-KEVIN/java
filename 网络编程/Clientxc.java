import java.io.*;
import java.net.*;
import java.util.*;
public class Clientxc{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Socket mysocket = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		Thread readData;
		Read read = null;
		try{
			mysocket = new Socket();
			read = new Read();
			readData = new Thread(read);
			System.out.println("�����������IP:");
			String IP = scanner.nextLine();
			System.out.println("����˿ں�:");
			int port = scanner.nextInt();
			if(mysocket.isConnected()){}
			else{
				InetAddress address = InetAddress.getByName(IP);
				InetSocketAddress socketAddress = new InetSocketAddress(address,port);
				mysocket.connect(socketAddress);
				in = new DataInputStream(mysocket.getInputStream());
				out = new DataOutputStream(mysocket.getOutputStream());
				read.setDataInputStream(in);
				readData.start();
			}
		}
		catch(Exception e){
			System.out.println("�������ѶϿ�"+e);
		}
		System.out.println("����Բ�İ뾶(����������N):");
		while(scanner.hasNext()){
			double radius = 0;
			try{
				radius = scanner.nextDouble();
			}
			catch(InputMismatchException exp){
				System.exit(0);
			}
			try{
				out.writeDouble(port);
				out.writeDouble(radius);
			}
			catch(Exception e){}
		}
	}
}	
