public class House implements Runnable{
	int waterAmount;
	String s = "ˮ�Ѿ�������";
	String ns = "ˮ�����ȣ���ˮʧ��";
	public void setWater(int n){
		waterAmount = n;
	}
	public void run(){
		while(true){
			String name = Thread.currentThread().getName();
			if(name.equals("��")){
				if(waterAmount<2&&waterAmount>=0){
					System.out.println(name+"���ˮ");
					System.out.println(ns);
					return;
				}
				else{			
					System.out.println(name+"�ɹ���ˮ");
					waterAmount -= 2;
					}
			}
			else if(name.equals("è")){
				if(waterAmount<=0){
				System.out.println(s);
				return;
				}
				else{
					System.out.println(name+"�ɹ���ˮ");
					waterAmount -= 1;
				}
			}
			System.out.println(" ʣ"+waterAmount);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			if(waterAmount<=0){
				System.out.println(s);
				return;
			}
		}
	}
}