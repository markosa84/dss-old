package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.menu.userinputhandler.UserQuitRequestException;

public class QuitCommandExecutor extends AbstractMenuItemExecutor {

	public QuitCommandExecutor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute() {
		throw new UserQuitRequestException("Quit command executed!");
	}

}
