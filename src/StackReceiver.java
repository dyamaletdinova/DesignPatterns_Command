import java.util.Vector;

/**
 *
 * @author Diana Yamaletdinova Jan 24, 2017
 */
public class StackReceiver<E> {
	
	private Vector<E> stackVector;
	

	public StackReceiver() {
		stackVector = new Vector<E>();
	}

	public void push(E obj) {
		stackVector.insertElementAt(obj, 0);
	}

	public E pop() {
		if (stackVector.size() > 0) {
			E obj = stackVector.firstElement();
			stackVector.removeElementAt(0);
			return obj;
		} else
			return null;
	}

	public int getSize() {
		return stackVector.size();
	}
	
	public Vector<E> clear() {
		stackVector.setSize(0);
		return stackVector;
	}

	public Vector<E> getStackVector() {
		return stackVector;
	}

}
