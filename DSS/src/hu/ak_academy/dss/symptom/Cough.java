package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class Cough extends AbstractSymptom {

	public Cough(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getDescription() {
		return "cough";
	}

	@Override
	public String getBodyPart() {
		return "mouth";
	}

}
