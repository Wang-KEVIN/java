import java.util.*;
	public class jiage{
		public static void main(String args[]){
			String cost = " daeew 312.5 v. 3 ddas.dsdas 222"; //Ĭ���ǿո�ָ�
			Scanner scanner = new Scanner(cost);
			double sum = 0;
			scanner.useDelimiter("[^0123456789.]+");	//�޸ķָ�����
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
			System.out.println("������:" + sum + "Ԫ");
		}
	}