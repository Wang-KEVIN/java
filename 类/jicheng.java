class EspecialCar{
	void cautionSound(){}
}

class PoliceCar extends EspecialCar{
	void cautionSound(){
		System.out.println("�����ľ�����: ZZZZZZ");
	}
}

class AmbulanceCar extends EspecialCar{
	void cautionSound(){
	 	System.out.println("�Ȼ����ľȻ���: JJJJJJ");
	}
}

class FireCar extends EspecialCar{
	void cautionSound(){
		System.out.println("�������ľȻ���: HHHHHHH");
	}
}


public class jicheng{
	public static void main(String args[]){
		EspecialCar car = new PoliceCar();//��ת��
		car.cautionSound();
		car = new AmbulanceCar();
		car.cautionSound();
		car = new FireCar();
		car.cautionSound();
	}
}