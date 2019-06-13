interface TyresStandard{		//借口
	public final int size =17;
	public void turnWheel();
	public String getTyresName();
}

class Car{
	public void useTyres(TyresStandard tyres){
		System.out.println(tyres.getTyresName());
		//tyres.getTyresName();		//接口回调
		tyres.turnWheel();		//接口回调
	}
}

class Miqilin implements TyresStandard{
	public void turnWheel(){
		System.out.println("轮胎大小是:"+TyresStandard.size);
		System.out.println("轮胎正常转动,最大转数:2888/m");
	}
	public String getTyresName(){
		return "品牌是米其林";
	}
}

class Puliston implements TyresStandard{
	public void turnWheel(){
		int Car_size = TyresStandard.size + 1;
		System.out.println("轮胎大小是:"+Car_size);
		System.out.println("轮胎正常转动,最大转数:2888/m");
	}
	public String getTyresName(){
		return "品牌是普利司通";
	}
}

public class qiche{
	public static void main(String args[]){
		Car car = new Car();
		car.useTyres(new Miqilin());
		car.useTyres(new Puliston());
	}
}