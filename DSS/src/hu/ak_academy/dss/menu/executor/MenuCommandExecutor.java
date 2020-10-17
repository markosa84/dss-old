package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.interfaces.MenuItemExecutor;

public class MenuCommandExecutor implements MenuItemExecutor {

	@Override
	public boolean execute() {
		System.out.println("Menu command executed!");
		return true;
	}

}
