package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.interfaces.MenuItemExecutor;

public class BackCommandExecutor implements MenuItemExecutor {

	@Override
	public boolean execute() {
		System.out.println("Back Command executed!");
		return false;
	}

}
