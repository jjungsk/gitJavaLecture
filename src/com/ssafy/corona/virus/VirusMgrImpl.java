package com.ssafy.corona.virus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class VirusMgrImpl implements VirusMgr {
	private Virus[] virus = new Virus[100];
	private int index;
//	private final int MAX = 100;
	
	// singleTone
	private VirusMgrImpl() {}
	private static VirusMgrImpl vmi = new VirusMgrImpl();
	public static VirusMgrImpl getInstance() {
		return vmi;
	}
	
	
//	public VirusMgrImpl() {
//		virus = new Virus[100];		
//	}
	
	@Override
	public void add(Virus v) throws DuplicatedException {
		for (int i = 0; i <= index; i++) {
			if (virus[i] != null && virus[i].getName() == v.getName()) {
				throw new DuplicatedException(v.getName() + ": 등록된 바이러스입니다.");
			}
		}
		virus[index++] = v;
//		try {
//			search(v.getName());
//		} catch (NotFoundException e) {
//			virus[index++]=v;
//		}
	}
	
	@Override
	public Virus[] search() {
		Virus[] tempV = Arrays.copyOfRange(virus, 0, index);
		return tempV;
	}
	
	@Override
	public Virus search(String name) throws NotFoundException{
		for(int i=0; i < index; i++) {
			if(virus[i].getName().equals(name)) return virus[i];
		}
		throw new NotFoundException(name+": 미등록 바이러스입니다.");
	}


	@Override
	public void save() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("virus.dat"));
			oos.writeObject(virus);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


	@Override
	public Virus[] load() {
		File file = new File("virus.dat");
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			try {
				Virus[] virus = (Virus[]) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return virus;
	}
}
