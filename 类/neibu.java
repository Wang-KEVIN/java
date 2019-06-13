class RedCowForm{
	static String formName;
	RedCow cow;		//内部类声明对象
	RedCowForm(){}
	RedCowForm(String s){
		cow = new RedCow(150,112,5000);
		formName = s;
	}
	public void showCowMess(){
		cow.speak();
	}
	//内部类
	class RedCow{
		String cowName = "红牛";
		int height,weight,price;
		RedCow(int h,int w,int p){
			height = h;
			weight = w;
			price = p;
		}
		void speak(){
			System.out.println("我是"+cowName+",身高"+height+"cm 体重:"+weight + "kg,生活在"+formName);
		}
	}
}

public class neibu{
	public static void main(String args[]){
		RedCowForm form = new RedCowForm("红牛市场");
		form.showCowMess();
		form.cow.speak();
	}
}