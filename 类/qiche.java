interface TyresStandard{		//���
	public final int size =17;
	public void turnWheel();
	public String getTyresName();
}

class Car{
	public void useTyres(TyresStandard tyres){
		System.out.println(tyres.getTyresName());
		//tyres.getTyresName();		//�ӿڻص�
		tyres.turnWheel();		//�ӿڻص�
	}
}

class Miqilin implements TyresStandard{
	public void turnWheel(){
		System.out.println("��̥��С��:"+TyresStandard.size);
		System.out.println("��̥����ת��,���ת��:2888/m");
	}
	public String getTyresName(){
		return "Ʒ����������";
	}
}

class Puliston implements TyresStandard{
	public void turnWheel(){
		int Car_size = TyresStandard.size + 1;
		System.out.println("��̥��С��:"+Car_size);
		System.out.println("��̥����ת��,���ת��:2888/m");
	}
	public String getTyresName(){
		return "Ʒ��������˾ͨ";
	}
}

public class qiche{
	public static void main(String args[]){
		Car car = new Car();
		car.useTyres(new Miqilin());
		car.useTyres(new Puliston());
	}
}