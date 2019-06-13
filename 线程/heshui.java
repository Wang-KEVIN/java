public class heshui{
	public static void main(String args[]){
		House house = new House();
		house.setWater(10);
		Thread cat,dog;	
		dog = new Thread(house);
		cat = new Thread(house);
		dog.setName("¹·");
		cat.setName("Ã¨");
		dog.start();
		cat.start();
	}
}