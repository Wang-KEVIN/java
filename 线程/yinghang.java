class Bank implements Runnable{
	int money = 0;
	public void setMoney(int n){
		money = n;
	}
	public void run(){
		if(Thread.currentThread().getName().equals("会计"))
			saveOrTake(300);
		else if(Thread.currentThread().getName().equals("出纳"))
			saveOrTake(150);
	}
	//单一线程使用该方法
	public synchronized void saveOrTake(int amount){
		if(Thread.currentThread().getName().equals("会计")){
			for(int i=1;i<=3;i++){
				money += 50;
				System.out.println(Thread.currentThread().getName()+"存入50万元,账号上有"+money+"万元，休息一会再存");
				try{Thre   ad.sleep(1000);}
				catch(InterruptedException e){}
			}
		}
	
		else if(Thread.currentThread().getName().equals("出纳")){
			for(int i=1;i<=3;i++){
				money -= 50;
				System.out.println(Thread.currentThread().getName()+"取出50万元,账号上有"+money+"万元，休息一会再取");
				try{Thread.sleep(1000);}
				catch(InterruptedException e){}
			}
		}
	}
}
		
public class yinghang{
	public static void main(String args[]){
		Bank bank = new Bank();
		bank.setMoney(200);
		Thread accountant,cashier;
		accountant = new Thread(bank);
		cashier = new Thread(bank);
		accountant.setName("会计");
		cashier.setName("出纳");
		accountant.start();
		cashier.start();
	}
}