package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.executor.MenuItemExecutor;

public class CommandMenuItem extends AbstractMenuItem {

	public CommandMenuItem(String shortcut, String label, MenuItemExecutor menuItemExecutor) {
		super(shortcut, label, NOT_VISIBLE, SELECTABLE, menuItemExecutor);
	}
}
