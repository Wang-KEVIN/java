class EspecialCar{
	void cautionSound(){}
}

class PoliceCar extends EspecialCar{
	void cautionSound(){
		System.out.println("警车的警笛声: ZZZZZZ");
	}
}

class AmbulanceCar extends EspecialCar{
	void cautionSound(){
	 	System.out.println("救护车的救护声: JJJJJJ");
	}
}

class FireCar extends EspecialCar{
	void cautionSound(){
		System.out.println("消防车的救火声: HHHHHHH");
	}
}


public class jicheng{
	public static void main(String args[]){
		EspecialCar car = new PoliceCar();//上转型
		car.cautionSound();
		car = new AmbulanceCar();
		car.cautionSound();
		car = new FireCar();
		car.cautionSound();
	}
}