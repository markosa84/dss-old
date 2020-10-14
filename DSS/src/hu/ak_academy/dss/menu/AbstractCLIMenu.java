package hu.ak_academy.dss.menu;

import java.util.List;
import java.util.Scanner;

import hu.ak_academy.dss.menu.item.MenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;

public abstract class AbstractCLIMenu <T extends MenuItem>  {
	protected Scanner input;
	protected UserInputHandler userInputHandler;
	protected List<T> menuItems;
	
	public AbstractCLIMenu(UserInputHandler userInputHandler, List<T> menuItems) {
		this.menuItems = menuItems;
		this.userInputHandler = userInputHandler;
	}

	public final void execute() {
		boolean isItStillRunnig = true;
		while (isItStillRunnig) {
			this.displayMenu();
			isItStillRunnig = this.choose();
		}
	}

	protected final void displayMenu() {
		this.displayMenuHeader();

		for (T menuItem : this.menuItems) {
			System.out.print(menuItem);
			this.displayExtrtaMenuInformation(menuItem);
		}

		this.displayMenuFooter();
	}

	protected final boolean choose() {
		T userChoice;
		do {
			userChoice = validateUserInput(userInputHandler.getUserInput());
		} while (userChoice == null);

		return process(userChoice);
	}

	protected T validateUserInput(String userChoice) {
		// first look in actual menuitem prefixes and labels
		for (T menuItem : menuItems) {
			if (menuItem.getPrefix().equals(userChoice) || menuItem.getLabel().equals(userChoice)) {
				return menuItem;
			}
		}
		
		return null;
	}
	
	protected void displayMenuHeader() {}

	protected void displayMenuFooter() {
		System.out.println();
	}

	protected void displayExtrtaMenuInformation(T menuItem) {}
	
	protected abstract boolean process(T menuItem);
}
