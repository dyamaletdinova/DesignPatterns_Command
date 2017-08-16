/**
 * 
 */

/**
 *
 * @author Diana Yamaletdinova
 * Jan 24, 2017
 */
public class PushCommand implements Command{
	StackReceiver<String> stackReceiver;
	String object;
	
	public PushCommand(StackReceiver<String> stackReceiver, String object) {
		this.stackReceiver = stackReceiver;
		this.object = object;
	}

	@Override
	public void execute() {
		stackReceiver.push( object);
	}

	@Override
	public void undo() {
		stackReceiver.pop();
		
	}


}
