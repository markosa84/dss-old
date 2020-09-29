package hu.ak_academy.dss.userinputhandler;

import java.util.List;
import java.util.Scanner;

public class UserInputHandler {

	private Scanner input;
	private List<String> nameOfOrgans;

	public UserInputHandler(Scanner input, List<String> nameOfOrgans) {
		this.input = input;
		this.nameOfOrgans = nameOfOrgans;
	}

	public String getBodyPart() {
		String userGivenOrgan;
		do {
			System.out.println("Please enter the organ: ");
			userGivenOrgan = input.next();
		} while (!nameOfOrgans.contains(userGivenOrgan));
		return userGivenOrgan;
	}

}
