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
	  String title = "恭贺新年";
	  String content = "\t岁岁平安\n\t身体健康\n\t万事如意\n";
	  ChristmasCard card = new ChristmasCard(title,content);
	  card.showCard();
	}
}