abstract class Geometry{
	public abstract double getArea();
}

class Pillar{
	Geometry bottom;
	double height;
	Pillar(Geometry bottom,double height){
		this.bottom = bottom;
		this.height = height;
	}
	public double getVolume(){
		return bottom.getArea()*height;
	}
}

class Circle extends Geometry{
	double r;
	Circle(double r){
		this.r = r;
	}
	public double getArea(){
		return(3.14*r*r);
	}
}

class Rectangle extends Geometry{
	double a,b;
	Rectangle(double a,double b){
		this.a = a;
		this.b = b;
	}
	public double getArea(){
		return a*b;
	}
}

public class mianxiang{
	public static void main(String args[]){
		Pillar pillar;
		Geometry bottom;
		bottom = new Rectangle(4,5);
		pillar = new Pillar(bottom,10);
		System.out.println("矩柱的体积是:"+pillar.getVolume());
		bottom = new Circle(10);
		pillar = new Pillar(bottom,10);
		System.out.println("圆柱体的体积是:"+pillar.getVolume());
	}
}