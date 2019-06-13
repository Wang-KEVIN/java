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
	public static void main(String args[]){			//可以写成C:\\..或者C/..
		File dir = new File("C:\\Users\\Administrator\\Desktop\\代码\\javal\\组件及事件处理");
		FileAccept acceptCondition = new FileAccept("class"); //条件,文件类型
		File fileName[] = dir.listFiles(acceptCondition);
		for(int i = 0;i<fileName.length;i++){
			fileName[i].delete();
			System.out.println("删除"+i);
		}
	}
}