import java.util.Scanner;
public class bijiao{
	public static void main(String args[]){
		System.out.println("��������a,b,c");
		int t = 0;
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		if(b<a){
		  t = a;
		  a = b;
		  b = t;
		}
		if(c<a){
		  t = a;
		  a = c;
		  c = t;
		}
		if(c<b){
		  t = b;
		  b = c;
		  c = t;
	 	}
		System.out.println("��С������"+a+","+b+","+c);
	}
}