package hu.ak_academy.dss.menu.executor;

public class MenuCommandExecutor extends AbstractMenuItemExecutor {

	public MenuCommandExecutor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute() {
		System.out.println("Menu command executed!");
		return true;
	}

}
