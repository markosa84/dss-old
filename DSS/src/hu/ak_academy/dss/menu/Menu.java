package hu.ak_academy.dss.menu;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class Menu {

	private Symptom[]symptoms;
	private UserInputHandler input;

	public Menu(Symptom[] symptoms, UserInputHandler input) {
		this.symptoms = symptoms;
		this.input = input;
	}

	public boolean choose() {
		String userGivenOragan = input.getBodyPart();
		for (Symptom symptom : symptoms) {
			if (userGivenOragan.equals(symptom.getBodyPart())) {
				System.out.print(symptom);
			}
		}
		return false;
	}

}
