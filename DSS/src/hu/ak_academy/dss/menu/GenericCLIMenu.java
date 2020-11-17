package hu.ak_academy.dss.menu;

import java.util.Scanner;

import hu.ak_academy.dss.container.MenuContainer;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;

public class GenericCLIMenu {
	protected Scanner input;
	protected UserInputHandler userInputHandler;
	protected MenuContainer menuItems;
	
	public GenericCLIMenu(UserInputHandler userInputHandler, MenuContainer menuItems) {
		this.menuItems = menuItems;
		this.userInputHandler = userInputHandler;
	}

	public void execute() {
		boolean isItStillRunnig = true;
		while (isItStillRunnig) {
			this.menuItems.display();
			isItStillRunnig = this.choose();
		}
	}

	protected boolean choose() {
		boolean validChoice;
		String userInput;
		
		do {
			userInput = userInputHandler.getUserInput();
			validChoice = menuItems.validateUserInput(userInput);
		} while (!validChoice);

		return menuItems.executeUserInput(userInput);
	}

}
