public class House implements Runnable{
	int waterAmount;
	String s = "水已经被喝完";
	String ns = "水不够喝，喝水失败";
	public void setWater(int n){
		waterAmount = n;
	}
	public void run(){
		while(true){
			String name = Thread.currentThread().getName();
			if(name.equals("狗")){
				if(waterAmount<2&&waterAmount>=0){
					System.out.println(name+"想喝水");
					System.out.println(ns);
					return;
				}
				else{			
					System.out.println(name+"成功喝水");
					waterAmount -= 2;
					}
			}
			else if(name.equals("猫")){
				if(waterAmount<=0){
				System.out.println(s);
				return;
				}
				else{
					System.out.println(name+"成功喝水");
					waterAmount -= 1;
				}
			}
			System.out.println(" 剩"+waterAmount);
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