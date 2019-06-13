import java.net.*;
public class huoqudizhi{
	public static void main(String args[]){
		try{
			InetAddress address_1 = InetAddress.getByName("www.sina.com.cn");
			System.out.println(address_1.toString());
			InetAddress address_2 = InetAddress.getByName("222.76.214.60");
			System.out.println(address_2.toString());
		}
		catch(UnknownHostException e){
			System.out.println("Œﬁ∑®’“µΩwww.sina.com.cn");
		}
	}
}