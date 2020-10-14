package hu.ak_academy.dss.menu.executor;

public class QuitCommandExecutor extends AbstractMenuItemExecutor {

	public QuitCommandExecutor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute() {
		System.out.println("Quit command executed!");
		return false;
	}

}
