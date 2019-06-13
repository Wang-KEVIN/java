class TicketHouse implements Runnable{
	int fiveAmount = 2,tenAmount = 0, twentyAmount = 0;	//售票员只有两张5元
	public void run(){
		if(Thread.currentThread().getName().equals("张"))
			saleTicket(20);
		else if(Thread.currentThread().getName().equals("王"))
			saleTicket(5);
	}

private synchronized void saleTicket(int money){
	if(money==5){
		fiveAmount += 1;
		System.out.println("给"+Thread.currentThread().getName()+"入场券,"+Thread.currentThread().getName()+"的钱正好");
	}
	else if(money==20){
		while(fiveAmount<3){
			try{	
				System.out.println("\n"+Thread.currentThread().getName()+"等....");
				wait();
				System.out.println("\n"+Thread.currentThread().getName()+"继续买票");
			}
			catch(InterruptedException e){}
		}
		fiveAmount -= 3;
		twentyAmount += 1;
		System.out.println("给"+Thread.currentThread().getName()+"入场券,"+Thread.currentThread().getName()+"给20元，找回15元");
	}
	notifyAll();	//通知结束等待  
}

}
				

public class dianyingpiao{
	public static void main(String args[]){
		TicketHouse officer = new TicketHouse();
		Thread zhang,wang;
		zhang = new Thread(officer);
		wang = new Thread(officer);
		zhang.setName("张");
		wang.setName("王");
		zhang.start();
		wang.start();
	}
}