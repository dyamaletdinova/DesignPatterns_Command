/**
 * 
 */

/**
 * Invoker
 * 
 * @author Diana Yamaletdinova Jan 24, 2017
 * @param <E>
 */
public class CommandManager<E> {
	StackReceiver<E> undoStack = new StackReceiver<E>();
	StackReceiver<E> redoStack = new StackReceiver<E>();

	public void executeCommand(Command command) {
		command.execute();
		undoStack.push((E) command);
	}

	public boolean redo() {
		if (redoStack.getSize() > 0) {
			Command command = (Command) redoStack.pop();
			executeCommand(command);
			return true;
		}
		return false;
	}

	public boolean undo() {
		if (undoStack.getSize() > 0) {
			Command command = (Command) undoStack.pop();
			command.undo();
			redoStack.push((E) command);
			return true;
		}
		return false;
	}
}
