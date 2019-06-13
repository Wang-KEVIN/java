import java.util.*;
	public class jiage{
		public static void main(String args[]){
			String cost = " daeew 312.5 v. 3 ddas.dsdas 222"; //默认是空格分割
			Scanner scanner = new Scanner(cost);
			double sum = 0;
			scanner.useDelimiter("[^0123456789.]+");	//修改分割条件
			while(scanner.hasNext()){
				try{
					double price = scanner.nextDouble();
					sum += price;
					System.out.println(price);
				}
				catch(InputMismatchException exp){
					String t = scanner.next();
					}
			}
			System.out.println("总消费:" + sum + "元");
		}
	}