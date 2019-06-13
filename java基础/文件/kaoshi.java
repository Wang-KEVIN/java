import java.io.*;
import java.util.Scanner;
	public class kaoshi{
		public static void main(String args[]){
			Scanner inputAnswer = new Scanner(System.in);
			int score = 0;
			StringBuffer answer = new StringBuffer();
			String result = "ACDD";
			try{
				FileReader inOne = new FileReader("test.txt");
				BufferedReader inTwo = new BufferedReader(inOne);
				String s = null;
				while((s=inTwo.readLine())!=null){
					if(!s.startsWith("*"))
						System.out.println(s);
					else{
						System.out.println("请输入选择的答案(A,B,C,D):");
						String str = inputAnswer.nextLine();
						try{
							char c = str.charAt(0);
							answer.append(c);
						}
						catch(StringIndexOutOfBoundsException exp){
							answer.append("*");
						}
					}
				}
			inOne.close();
			inTwo.close();
		}
			catch(IOException exp){}
			for(int i = 0;i<result.length();i++){
				if(result.charAt(i) == answer.charAt(i)||result.charAt(i)==answer.charAt(i)-32)
					score++;
			}
			System.out.printf("最后得分是:%d\n",score);
	}
}
		
				
			