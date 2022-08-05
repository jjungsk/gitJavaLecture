package testMaterial.test3_220808.car.testMaterial.test3_220808.car;

import java.io.*;
import java.util.*;

public class CarManagerImpl implements CarManager {

	// Attributes
	private List<Car> list = new ArrayList<Car>();
//	private Car[] carList = new Car[100];
//	private int idx;
	
	
	// singleTone (생성자를 private -> private 내부 class 에서만 불러올수 있으므로 private 으로 새로운 instance 선언 -> getInstance 함수를 다른 class에서
	// 불러와야 하므로 public 선언 + 객체를 외부에서 선언하지 못하므로 static method로 선언 -> static method에서 사용하는 변수는 무조건 static으로 선언 필요!!!
	private CarManagerImpl() {} // constructor private 
	private static CarManagerImpl cm = new CarManagerImpl(); // private static 객체 생성
	public static CarManagerImpl getInstance() { // public static getInstance() 불러오기
		return cm;
	}
	
	@Override
	public void add(Car car) throws SameNumberException {
		// TODO Auto-generated method stub
		car.getCarNum();
		for (Car ca: list)
			if (ca.getCarNum() == car.getCarNum()) {
				throw new SameNumberException("SameNumberExceptrion 발생 : " + car.getCarNum() + "은 이미 등록!!!");
			}
		
		list.add(car);
		
//		for (int i = 0; i < idx; i++) {
//			if (carList[i].getCarNum() == carList[i].getCarNum()) {
//				throw new SameNumberException("SameNumberExceptrion 발생 : " + car.getCarNum() + "은 이미 등록!!!");
//			}
//		}
//		carList[idx++] = car;
	}

	@Override
	public List<Car> searchAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Car searchByNum(int carNum) throws NotFoundException {
		// TODO Auto-generated method stub
		for (Car c: list) {
			if (c.getCarNum() == carNum) {
				return c;
			}
		}
		throw new NotFoundException("NotFoundException 발생 : " + carNum + "은 없습니다!!!");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		ObjectOutputStream oop = null;
		try {
			oop = new ObjectOutputStream(new FileOutputStream("car.dat"));
			oop.writeObject(list);
			oop.flush(); // buffer 쌓여있는것을 지운다!!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oop != null)
					oop.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Car> load() {
		File file = new File("car.dat");
		if (file.exists()) {
			ObjectInputStream in = null;
			try {
				in = new ObjectInputStream(new FileInputStream(file));
				try {
					list = (List<Car>) in.readObject(); // Object 로 return 되므로 형 변환 필요!!
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // in.readObject의 return 타입
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (in != null)
						in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return list;
		} else {
			return Collections.EMPTY_LIST;
		}
		
	}

}
