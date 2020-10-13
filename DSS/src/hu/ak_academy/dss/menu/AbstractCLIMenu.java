package hu.ak_academy.dss.menu;

import java.util.List;

import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public abstract class AbstractCLIMenu {
	protected UserInputHandler userInputHandler;
	protected List<String> menuItems;
	
	public AbstractCLIMenu(UserInputHandler userInputHandler, List<String> menuItems) {
		this.userInputHandler = userInputHandler;
		this.menuItems = menuItems;
	}

	public void execute() {
		boolean isItStillRunnig = true;
		while (isItStillRunnig) {
			this.displayMenu();
			isItStillRunnig = this.choose();
		}
	}

	protected void displayMenu() {
		this.displayMenuHeader();

		int i = 1;
		for (String menuItem : this.menuItems) {
			System.out.print(i++ + ". " + menuItem);
			this.displayExtrtaMenuInformation(i, menuItem);
		}

		this.displayMenuFooter();
	}

	protected boolean choose() {
		return process(userInputHandler.getUserChoice(this.menuItems));
	}

	protected void displayMenuHeader() {}

	protected void displayMenuFooter() {
		System.out.println();
	}

	protected void displayExtrtaMenuInformation(int index, String menuItem) {}
	
	protected abstract boolean process(String userChoice);
}
