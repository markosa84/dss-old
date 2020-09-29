package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class ToothAche extends AbstractSymptom {

	public ToothAche(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getDescription() {
		return "toothache";
	}

	@Override
	public String getBodyPart() {
		return "mouth";
	}

}
