/**
 * 
 */

/**
 *
 * @author Diana Yamaletdinova
 * Jan 24, 2017
 */
public class PopCommand implements Command{

	StackReceiver<String> stackReceiver;
	String string = "";

	public PopCommand(StackReceiver<String> stackReceiver) {
		this.stackReceiver = stackReceiver;
	}
	
	@Override
	public void execute() {
		string = (String) stackReceiver.pop();
	}

	@Override
	public void undo() {
		stackReceiver.push(string);
	}
}
