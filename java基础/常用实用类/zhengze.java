public class zhengze{
	public static void main(String args[]){
		String str = "1991��12��12��";
		String regex = "\\D+";
		System.out.println(str);
		str = str.replaceAll(regex,"/");
		System.out.println(str);
		String money = "8888888��";
		System.out.print(money+"ת��������:");
		String s = money.replaceAll("[,\\p{Sc}]","");	//"\\p{Sc}"��ƥ���κλ��ҷ�����
		//longnumber = Long.parseLong(s);
		System.out.println(s);
	}
}