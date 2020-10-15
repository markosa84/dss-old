package hu.ak_academy.dss.menu.container;

import java.util.ArrayList;
import java.util.List;

import hu.ak_academy.dss.menu.item.MenuItem;

public class MenuContainer {
	private List<MenuItem> menuItems;

	public MenuContainer() {
		this.menuItems = new ArrayList<>();
	}

	public List<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public void add(MenuItem menuItem) {
		this.menuItems.add(menuItem);
	}

	public void add(MenuContainer otherMenuContainer) {
		for (MenuItem otherMenuItem : otherMenuContainer.getMenuItems()) {
			this.add(otherMenuItem);			
		}
	}

	public boolean contains(MenuItem otherMenuItem) {
		if (menuItems.contains(otherMenuItem)) {
			return true;
		} else {
			return false;	
		}				
	}
	
	public void display() {

		for (MenuItem menuItem : this.menuItems) {
			menuItem.display();
			//this.displayExtrtaMenuInformation(menuItem);
		}
	}
	
	public boolean validateUserInput(String userInput) {

		for (MenuItem menuItem : this.menuItems) {
			if (menuItem.validateUserInput(userInput)) {
				return true;
			}
		}
		
		return false;
	}

//	public MenuItem findUserInput(String userInput) {
//
//		for (MenuItem menuItem : this.menuItems) {
//			if (menuItem.validateUserInput(userInput)) {
//				return menuItem;
//			}		
//		}
//
//		return null;
//	}

	public boolean executeUserInput(String userInput) {

		for (MenuItem menuItem : this.menuItems) {
			if (menuItem.validateUserInput(userInput)) {
				return menuItem.execute();
			}		
		}

		return false;
	}
}
