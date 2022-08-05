package testMaterial.test3_220808.corona.virus;

public class DuplicatedException extends Exception{
	public DuplicatedException(String msg) {
		super(msg);
	}
	public DuplicatedException() {
		this("Duplicated예외");
	}
}
