package com.ssafy.iotest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	
	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader fin = null;
		FileWriter fw = null;
		
		try {
			System.out.print("읽을 파일 이름 : ");
			String rfile = in.readLine();
			System.out.print("저장할 파일 이름 : ");
			String sfile = in.readLine();
			
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(rfile)));
			fw = new FileWriter("c:\\iotest\\" + sfile);
			
			String txt = "";
			while ((txt = fin.readLine()) != null) {
				System.out.println(txt);
				fw.write(txt + "\n");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fin != null)
					fin.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
