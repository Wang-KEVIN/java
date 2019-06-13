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
				System.out.printf("给%d秒的时间背单词:%s",stopTime,word);
				Thread.sleep(stopTime*1000);
				System.out.println("\r");
				for(int i = 1;i<50;i++)
					System.out.println("*");
				System.out.println("\n输入曾显示的单词:");
				String input = reader.nextLine();
				if(input==null)
					input="******";
				if(input.equals(word)){
					isRightNumber++;
				}
				System.out.printf("当前正确率:%5.2f%%\n",100*(float)isRightNumber/wordNumber);
			}
		System.out.printf("测试结束/总正确率:%5.2f%%\n",100*(float)isRightNumber/wordNumber);
		}
		catch(Exception exp){
			System.out.println(exp);
		}	
	}
}