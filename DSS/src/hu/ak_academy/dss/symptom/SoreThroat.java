package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class SoreThroat extends AbstractSymptom {

	public SoreThroat(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getDescription() {
		return "Sore throat";
	}

	@Override
	public String getBodyPart() {
		return "mouth";
	}

}
