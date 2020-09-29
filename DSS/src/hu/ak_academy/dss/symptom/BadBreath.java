package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class BadBreath extends AbstractSymptom {

	public BadBreath(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getDescription() {
		return "bad breath";
	}

	@Override
	public String getBodyPart() {
		return "mouth";
	}

}
