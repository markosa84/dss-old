package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.interfaces.MenuItemExecutor;
import hu.ak_academy.dss.menu.userinputhandler.UserQuitRequestException;

public class QuitCommandExecutor implements MenuItemExecutor {

	@Override
	public boolean execute() {
		throw new UserQuitRequestException("Quit command executed!");
	}

}
