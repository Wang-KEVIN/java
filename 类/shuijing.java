class Village{
	static int waterAmount;	//���������
	int peopleNumber;
}

public class shuijing{
	public static void main(String args[]){
		Village.waterAmount = 200;
		System.out.println("ˮ������"+Village.waterAmount+" ��ˮ");
		Village zhaozhuang = new Village(),lizhuang = new Village();
		int m = 50;
	 	System.out.println("��ׯ��ˮ��ȡˮ"+ m + " ��");
		zhaozhuang.waterAmount -= m;
		System.out.println("����ˮ���л���"+Village.waterAmount + "��ˮ");
		m = 100;
		System.out.println("��ׯ��ˮ����ȡˮ" + m + "��");
		lizhuang.waterAmount -= m;
		System.out.println("����ˮ������" + lizhuang.waterAmount + "��ˮ"); 
	}
}