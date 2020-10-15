package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.executor.MenuItemExecutor;

public class GenericMenuItem extends AbstractMenuItem {

	public GenericMenuItem(String shortcut, String label, MenuItemExecutor menuItemExecutor) {
		super(shortcut, label, menuItemExecutor);
	}
}
