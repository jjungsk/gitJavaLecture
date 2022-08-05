package testMaterial.test3_220808.car.testMaterial.test3_220808.car;

import java.util.List;

public interface CarManager {
	
	
	void add(Car car) throws SameNumberException;
	List<Car> searchAll();
	Car searchByNum(int carNum) throws NotFoundException;
	void save();
	List<Car> load();

}
