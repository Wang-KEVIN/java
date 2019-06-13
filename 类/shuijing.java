class Village{
	static int waterAmount;	//类变量共享
	int peopleNumber;
}

public class shuijing{
	public static void main(String args[]){
		Village.waterAmount = 200;
		System.out.println("水井中有"+Village.waterAmount+" 升水");
		Village zhaozhuang = new Village(),lizhuang = new Village();
		int m = 50;
	 	System.out.println("赵庄从水井取水"+ m + " 升");
		zhaozhuang.waterAmount -= m;
		System.out.println("现在水井中还有"+Village.waterAmount + "升水");
		m = 100;
		System.out.println("李庄从水井中取水" + m + "升");
		lizhuang.waterAmount -= m;
		System.out.println("现在水井还有" + lizhuang.waterAmount + "升水"); 
	}
}