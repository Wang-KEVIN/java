import java.io.*;
	class FileAccept implements FilenameFilter{
		String str = null;
		FileAccept(String s){
			str = "." + s;
		}
		public boolean accept(File dir,String name){
			return name.endsWith(str);
		}
	}

public class mulu{
	public static void main(String args[]){			//����д��C:\\..����C/..
		File dir = new File("C:\\Users\\Administrator\\Desktop\\����\\javal\\��");
		FileAccept acceptCondition = new FileAccept("java"); //����,�ļ�����
		File fileName[] = dir.listFiles(acceptCondition);
		for(int i = 0;i<fileName.length;i++){
			System.out.printf("\n�ļ�����:%s,����:%d",fileName[i].getName(),fileName[i].length());
		}
	}
}