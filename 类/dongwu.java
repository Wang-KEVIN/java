abstract class Animal{
	public abstract void cry();
	public abstract String getAnimalName();
}

class Simulator{
	public void playSound(Animal animal){
		System.out.println("���ڲ���"+animal.getAnimalName()+"����:");
		animal.cry();
	}
}

class Dog extends Animal{
	public void cry(){
		System.out.println("WWWWWWW");
	}
	public String getAnimalName(){
		return "��";
	}
}

class Cat extends Animal{
	public void cry(){
		System.out.println("MMMMMMM");
	}
	public String getAnimalName(){
		return "è";
	}
}



public class dongwu{
	public static void main(String args[]){
		Simulator simulator = new Simulator();
		simulator.playSound(new Dog());
		simulator.playSound(new Cat());
	}

}