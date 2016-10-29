package MyPackage;

public class MyClass {
	
	protected int state;
	
	public MyClass() {
		state = 0;
	}
	
	public int getState() {
		return state;
	}
	
	public void doAction() {
		state++;
	}
}