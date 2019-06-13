import java.io.*;
import java.net.*;
public class Server{
	public static void main(String args[]){
		String []answer = {"aaaaaaa","bbbbbb","ccccccc"};
		ServerSocket serverForClient = null;
		Socket socketOnServer = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		try{serverForClient = new ServerSocket(2010);}
		catch(IOException e1){System.out.println(e1);}
		try{
			System.out.println("等待客户呼叫");//堵塞状态，等待客户进程
			socketOnServer = serverForClient.accept();
			in = new DataInputStream(socketOnServer.getInputStream());
			out = new DataOutputStream(socketOnServer.getOutputStream());
			for(int i=0;i<answer.length;i++){
				String s = in.readUTF();
				System.out.println("服务器收到客户信息:"+s);
				out.writeUTF(answer[i]);
				Thread.sleep(500);
			}
		}
		catch(Exception e){System.out.println("客户已断开"+e);}
	}
}