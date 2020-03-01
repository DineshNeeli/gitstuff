package practice;

import java.io.File;


public class SubFolderList {

	private static void ListFolders(String DirPath) {

		File Dfile =  new File(DirPath);
		File files[] = Dfile.listFiles();
		for(File file :files)
		{
			if(file.isFile())
			{
				System.out.println(file.getName());
			}else if(file.isDirectory())
			{
				System.out.println(file.getName());
				System.out.println(file.getAbsolutePath());
			}
		}
	}
	public static void main(String[] args)
	{
		ListFolders("E:\\");
		System.out.println("success");
	}



}




