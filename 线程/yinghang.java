class Bank implements Runnable{
	int money = 0;
	public void setMoney(int n){
		money = n;
	}
	public void run(){
		if(Thread.currentThread().getName().equals("���"))
			saveOrTake(300);
		else if(Thread.currentThread().getName().equals("����"))
			saveOrTake(150);
	}
	//��һ�߳�ʹ�ø÷���
	public synchronized void saveOrTake(int amount){
		if(Thread.currentThread().getName().equals("���")){
			for(int i=1;i<=3;i++){
				money += 50;
				System.out.println(Thread.currentThread().getName()+"����50��Ԫ,�˺�����"+money+"��Ԫ����Ϣһ���ٴ�");
				try{Thre   ad.sleep(1000);}
				catch(InterruptedException e){}
			}
		}
	
		else if(Thread.currentThread().getName().equals("����")){
			for(int i=1;i<=3;i++){
				money -= 50;
				System.out.println(Thread.currentThread().getName()+"ȡ��50��Ԫ,�˺�����"+money+"��Ԫ����Ϣһ����ȡ");
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
		accountant.setName("���");
		cashier.setName("����");
		accountant.start();
		cashier.start();
	}
}