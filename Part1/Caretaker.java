import java.util.Vector;
import MyPackage.*;

public class Caretaker {
	
	private Vector<Memento> undoList;
	
	public Caretaker() {
		undoList = new Vector();
	}
	
	public void saveMyClass(MyClass mc) {
		undoList.add(new Memento(mc));
	}
	
	public void undo() {
		undoList.remove(undoList.size()-1).restore();
	}
}