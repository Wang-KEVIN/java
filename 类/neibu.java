class RedCowForm{
	static String formName;
	RedCow cow;		//�ڲ�����������
	RedCowForm(){}
	RedCowForm(String s){
		cow = new RedCow(150,112,5000);
		formName = s;
	}
	public void showCowMess(){
		cow.speak();
	}
	//�ڲ���
	class RedCow{
		String cowName = "��ţ";
		int height,weight,price;
		RedCow(int h,int w,int p){
			height = h;
			weight = w;
			price = p;
		}
		void speak(){
			System.out.println("����"+cowName+",���"+height+"cm ����:"+weight + "kg,������"+formName);
		}
	}
}

public class neibu{
	public static void main(String args[]){
		RedCowForm form = new RedCowForm("��ţ�г�");
		form.showCowMess();
		form.cow.speak();
	}
}