package sow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fhandling {
	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("C:\\sow\\gobal.txt");
		String s = "hi gokul";
		fs.write(s.getBytes());
		fs.flush();
		FileInputStream fs1 = new FileInputStream("C:\\sow\\gobal.txt");
		int s1 = 0;
		while((s1 = fs1.read()) != -1)
		{
			System.out.print((char)s1);
		}
	}
}