import java.io.*;
import java.util.*;
public class dancixunlian{
	public static void main(String args[]){
		File file = new File("english.txt");
		TestWord test = new TestWord();
		test.setFile(file);
		test.setStopTime(5);
		test.startTest();
	}
}

class TestWord{
	File file;
	int stopTime;
	public void setFile(File f){
		file = f;
	}
	public void setStopTime(int t){
		stopTime = t;
	}
	public void startTest(){
		Scanner sc = null;
		Scanner reader = new Scanner(System.in);
		int isRightNumber = 0,wordNumber = 0;
		try{
			sc = new Scanner(file);
			while(sc.hasNext()){
				wordNumber++;
				String word = sc.next();
				System.out.printf("��%d���ʱ�䱳����:%s",stopTime,word);
				Thread.sleep(stopTime*1000);
				System.out.println("\r");
				for(int i = 1;i<50;i++)
					System.out.println("*");
				System.out.println("\n��������ʾ�ĵ���:");
				String input = reader.nextLine();
				if(input==null)
					input="******";
				if(input.equals(word)){
					isRightNumber++;
				}
				System.out.printf("��ǰ��ȷ��:%5.2f%%\n",100*(float)isRightNumber/wordNumber);
			}
		System.out.printf("���Խ���/����ȷ��:%5.2f%%\n",100*(float)isRightNumber/wordNumber);
		}
		catch(Exception exp){
			System.out.println(exp);
		}	
	}
}