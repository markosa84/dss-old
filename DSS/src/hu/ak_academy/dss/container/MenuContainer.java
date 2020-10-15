package hu.ak_academy.dss.container;

import java.util.ArrayList;
import java.util.List;

import hu.ak_academy.dss.menu.item.MenuItem;
import hu.ak_academy.dss.symptom.Symptom;

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
			//this.displayExtrtaMenuInformation(menuItem);
		}
	}
	
	public boolean validateUserInput(String userInput) {

		for (MenuItem item : this.items) {
			if (item.validateUserInput(userInput)) {
				return true;
			}
		}
		
		return false;
	}

//	public MenuItem findUserInput(String userInput) {
//
//		for (MenuItem item : this.items) {
//			if (item.validateUserInput(userInput)) {
//				return item;
//			}		
//		}
//
//		return null;
//	}

	public boolean executeUserInput(String userInput) {

		for (MenuItem item : this.items) {
			if (item.validateUserInput(userInput)) {
				return item.execute();
			}		
		}

		return false;
	}
}
