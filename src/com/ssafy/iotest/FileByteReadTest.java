package com.ssafy.iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteReadTest {
	
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		try {
//			File file = new File("src\\com\\ssafy\\iotest\\StdInputTest.java");
//			fis = new FileInputStream(file);
//			int len = (int) file.length();
//			byte[] b= new byte[len];
//			int x = fis.read(b);
//			String s = new String(b);
//			System.out.println(s);
//			System.out.println(len + " " + x);
//			
//			File ofile = new File("c:\\iotest");
//			if (!ofile.exists())
//				ofile.mkdirs();
//			fos = new FileOutputStream(new File(ofile, "temp.txt"));
//			fos.write(b);
//			
////			fis.close();
////			fos.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (fis != null)
//					fis.close();
//				if (fos != null)
//					fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		File file = new File("src\\com\\ssafy\\iotest\\StdInputTest.java");
		File ofile = new File("c:\\iotest");
		if (!ofile.exists())
			ofile.mkdirs();
		// try ~ with ~ resource
		try (
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(new File(ofile, "temp.txt"));
			) {
			int len = (int) file.length();
			byte[] b= new byte[len];
			int x = fis.read(b);
			String s = new String(b);
			System.out.println(s);
			System.out.println(len + " " + x);
			
			if (!ofile.exists())
				ofile.mkdirs();
	
			fos.write(b);
//			fis.close();
//			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
