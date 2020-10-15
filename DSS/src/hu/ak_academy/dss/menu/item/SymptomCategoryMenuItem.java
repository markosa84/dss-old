package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.executor.MenuItemExecutor;

public class SymptomCategoryMenuItem extends GenericMenuItem {

	private int numberOfSubIterms;
	
	public SymptomCategoryMenuItem(String shortcut, String label, MenuItemExecutor menuItemExecutor, int numberOfSubIterms) {
		super(shortcut, label, menuItemExecutor);
		this.numberOfSubIterms = numberOfSubIterms;
	}
	
	@Override
	public void display() {
		if(visible) {
			System.out.println(this + " (" + this.numberOfSubIterms + ")");
		}
	}

}
