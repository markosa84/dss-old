package hu.ak_academy.dss.userinputhandler;

import java.util.List;
import java.util.Scanner;

public class UserInputHandler {

	private Scanner input;
	
	public UserInputHandler(Scanner input) {
		this.input = input;
	}

	public String getUserChoice(List<String> choices) {
		String userChoice;
		do {
			System.out.print("Please enter your selection: ");
			userChoice = input.nextLine();
		} while (!choices.contains(userChoice));
		
		return userChoice;
	}

	
	// This is not nice, need to merge these two methods better
	public String getUserChoice(List<String> choices, String prompt) {
		String userChoice;
		do {
			System.out.print(prompt);
			userChoice = input.nextLine();
		} while (!choices.contains(userChoice));
		
		return userChoice;
	}

}
