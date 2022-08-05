package com.ssafy.iotest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileCharReadTest {
	public static void main(String[] args) {
		System.out.print("파일 이름 입력 : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		try {
//			int x = isr.read();
//			System.out.println("x : " + x);
//			System.out.println("x : " + (char) x);
			char[] c = new char[100];
			int x = isr.read(c);
			String filename = new String(c, 0, x-2);
			System.out.println(Arrays.toString(c));
			System.out.println(filename);
			System.out.println(filename.length());
			
			fr = new FileReader("src\\com\\ssafy\\iotest\\" + filename);
			char[] cr = new char[1024];
			int y = fr.read(cr);
			fw = new FileWriter("c:\\iotest\\chartest.txt");
			fw.write(cr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
