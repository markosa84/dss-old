package hu.ak_academy.dss.menu.userinputhandler;

import java.util.Scanner;

public class UserInputHandler {

	private Scanner input;
	
	public UserInputHandler(Scanner input) {
		this.input = input;
	}
	
	public String getUserInput() {
		System.out.print("Please enter your selection: ");
		return input.nextLine();
	}

}
