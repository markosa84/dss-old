package hu.ak_academy.dss.container;

import hu.ak_academy.dss.menu.item.MenuItem;

public class MenuContainer extends ObjectContainer <MenuItem> {
	
	public MenuContainer() {
		super();
	}

	public MenuContainer(MenuItem[] items) {
		super(items);
	}
	
	public void display() {

		for (MenuItem item : this.items) {
			item.display();
		}
	}
	
	public boolean validateUserInput(String userInput) {
		MenuItem item = findUserInput(userInput);		
		return item == null ? false : true;
	}

	public boolean executeUserInput(String userInput) {
		MenuItem item = findUserInput(userInput);		
		return item == null ? false : item.execute();
	}

	protected MenuItem findUserInput(String userInput) {

		for (MenuItem item : this.items) {
			if (item.validateUserInput(userInput)) {
				return item;
			}
		}
		
		return null;
	}
}
