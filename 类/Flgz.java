class Card{
	String title;
	Card(){
	  title = "Happy New Year";
	}
	Card(String title){
	  this.title = title;
	}
	public String getTitle(){
	  return title;
	}
}

class ChristmasCard extends Card{
	String content;
	ChristmasCard(String title,String content){
	  super(title);
	  this.content = content;
	}

public void showCard(){
	System.out.println("\t"+getTitle());
	System.out.printf("%s",content); //printf
	}
}


public class Flgz{
	public static void main(String args[]){
	  String title = "��������";
	  String content = "\t����ƽ��\n\t���彡��\n\t��������\n";
	  ChristmasCard card = new ChristmasCard(title,content);
	  card.showCard();
	}
}