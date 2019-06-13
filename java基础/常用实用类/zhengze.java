public class zhengze{
	public static void main(String args[]){
		String str = "1991年12月12日";
		String regex = "\\D+";
		System.out.println(str);
		str = str.replaceAll(regex,"/");
		System.out.println(str);
		String money = "8888888￥";
		System.out.print(money+"转化成数字:");
		String s = money.replaceAll("[,\\p{Sc}]","");	//"\\p{Sc}"可匹配任何货币服符合
		//longnumber = Long.parseLong(s);
		System.out.println(s);
	}
}