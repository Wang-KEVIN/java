class TicketHouse implements Runnable{
	int fiveAmount = 2,tenAmount = 0, twentyAmount = 0;	//��ƱԱֻ������5Ԫ
	public void run(){
		if(Thread.currentThread().getName().equals("��"))
			saleTicket(20);
		else if(Thread.currentThread().getName().equals("��"))
			saleTicket(5);
	}

private synchronized void saleTicket(int money){
	if(money==5){
		fiveAmount += 1;
		System.out.println("��"+Thread.currentThread().getName()+"�볡ȯ,"+Thread.currentThread().getName()+"��Ǯ����");
	}
	else if(money==20){
		while(fiveAmount<3){
			try{	
				System.out.println("\n"+Thread.currentThread().getName()+"��....");
				wait();
				System.out.println("\n"+Thread.currentThread().getName()+"������Ʊ");
			}
			catch(InterruptedException e){}
		}
		fiveAmount -= 3;
		twentyAmount += 1;
		System.out.println("��"+Thread.currentThread().getName()+"�볡ȯ,"+Thread.currentThread().getName()+"��20Ԫ���һ�15Ԫ");
	}
	notifyAll();	//֪ͨ�����ȴ�  
}

}
				

public class dianyingpiao{
	public static void main(String args[]){
		TicketHouse officer = new TicketHouse();
		Thread zhang,wang;
		zhang = new Thread(officer);
		wang = new Thread(officer);
		zhang.setName("��");
		wang.setName("��");
		zhang.start();
		wang.start();
	}
}