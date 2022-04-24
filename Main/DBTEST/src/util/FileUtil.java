package util;

import java.io.*;

public class FileUtil {
	public static void saveImage(String root, String fname, byte[] data)
	throws IOException {
		System.out.println("파일 이름은 :" + fname);
		root += "\\images";
		System.out.println("파일 경로는 : " + root);
		File f = new File(root);
		if(!f.exists()) f.mkdir();
		
		f = new File(root + "\\" + fname);
		FileOutputStream out = new FileOutputStream(f);
		out.write(data);
		out.close();
	}
}