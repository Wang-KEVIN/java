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

public class shanchu{
	public static void main(String args[]){			//����д��C:\\..����C/..
		File dir = new File("C:\\Users\\Administrator\\Desktop\\����\\javal\\������¼�����");
		FileAccept acceptCondition = new FileAccept("class"); //����,�ļ�����
		File fileName[] = dir.listFiles(acceptCondition);
		for(int i = 0;i<fileName.length;i++){
			fileName[i].delete();
			System.out.println("ɾ��"+i);
		}
	}
}