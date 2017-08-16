
Applying Command Pattern in simple application where you can enter values and then push them onto a stack, 
or pop values from the stack, and the stack contents are always displayed.
The main goal of the command pattern is to separate the command creator, 
the command target (called receiver in GOF), and the command invoker. 
This decoupling has all of the standard SE benefits; modularity, encapsulation, re-use, etc.

Applying the Command pattern:

	- Command interface for push, pop, undo and redo functionalities;
	- the pop, push, and clear logic is implemented in the StackReceiver class; 
	- CommandManager is an invoker that handles the execution of the commands 
		and manages the undo and redo functionalities.
	
	