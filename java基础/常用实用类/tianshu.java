import java.util.*;
	public class tianshu{
		public static void main(String args[]){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			int year = calendar.get(Calendar.YEAR),
			month =  calendar.get(Calendar.MONTH)+1,
			day =  calendar.get(Calendar.DAY_OF_MONTH),
			hour =  calendar.get(Calendar.HOUR_OF_DAY),
			minute =  calendar.get(Calendar.MINUTE),
			second =  calendar.get(Calendar.SECOND);
			System.out.println("����ʱ����:");
			System.out.println(""+year+"��"+month+"��"+day+"��");
			System.out.println(""+hour+"ʱ"+minute+"��"+second+"��");
			int y = 2019,m=5,d=24;
			calendar.set(y,m-1,d);//��������ʱ��
			long time1 = calendar.getTimeInMillis();
			y = 2019; m = 9;day = 1;
			calendar.set(y,m-1,d);//������
			long time2 = calendar.getTimeInMillis();
			long subDay = (time2-time1)/(1000*60*60*24);
			System.out.println(""+new Date(time2));
			System.out.println("��"+new Date(time1));
			System.out.println("���"+subDay+"��");
	}
}
			