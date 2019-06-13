import java.net.*;
public class BroadCast{
	String s = "����ż�ʱ����9��30��";
	int port = 5858;		//�鲥�Ķ˿�
	InetAddress group = null;	//�鲥��ĵ�ַ
	MulticastSocket socket = null; 	//���㲥�׽���
	BroadCast(){
		try{
			group = InetAddress.getByName("239.255.8.0");//�㲥��ĵ�ַ
			socket = new MulticastSocket(port);	//port�˿ڹ㲥
			socket.setTimeToLive(1);		//�������ݱ���ΧΪ��������
			socket.joinGroup(group);		//����group��socket���͵����ݱ���Ա���յ�
			}
		catch(Exception e){		
			System.out.println("Error:"+e);
		}
	}
	public void play(){
		while(true){
			try{
				DatagramPacket packet = null;		//���㲥�����ݰ�
				byte data[] = s.getBytes();
				packet = new DatagramPacket(data,data.length,group,port);
				System.out.println(new String(data));
				socket.send(packet);			//�㲥���ݰ�
				Thread.sleep(2000);
			}
			catch(Exception e){	
				System.out.println("Error:"+e);
		}
	}
}


	public static void main(String args[]){
		new BroadCast().play();
	}
}
