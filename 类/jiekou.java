interface ComputerAverage{
	public double average(double [] x);
}

class Gymnastics implements ComputerAverage{
	public double average(double [] x){
		int count = x.length;
		double aver = 0,temp = 0;
		for(int i = 0;i<count;i++){
			for(int j=i+1;j<count-i-1;j++){
				if(x[j]<x[i]){
					temp = x[i];
					x[j] = x[i];
					x[i] = temp;
				}
			}
		}
		
		for(int i=1;i<count-1;i++){
			aver += x[i];	//去掉一个最高分和最低分
		}
		if(count>2)
			aver /= (count-2);
		else
			aver = 0;
		return aver;
	}
}


class School implements ComputerAverage{
	public double average(double []x){
		int count = x.length;
		double aver = 0;
		for(double param:x){
			aver += param;
		}
		aver /= count;
		return aver;
	}
}

public class jiekou{
	public static void main(String args[]){
		ComputerAverage computer;
		computer = new Gymnastics();
		double a[] = {9.29,9.76,9.99,63.9,87,99,9,9.84};
		double result = computer.average(a);
		System.out.printf("体操选手最后得分%5.3f\n",result);
		double b[] = {87,99,56,98,44,89,66,77,44,58,30};
		result = computer.average(b);
		System.out.printf("班级考试平均分%5.3f:",result);
	}
}