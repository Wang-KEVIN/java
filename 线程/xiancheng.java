public class xiancheng{
	public static void main(String args[]){
		SpeakElephant speakElephant;
		SpeakCar speakCar;
		speakElephant = new SpeakElephant();	//创建线程
		speakCar = new SpeakCar();		//创建线程
		speakElephant.start();			//启动线程
		speakCar.start();			//启动线程
		for(int i=1;i<=15;i++){
			System.out.println("主任"+i+" ");
		}
	}
}