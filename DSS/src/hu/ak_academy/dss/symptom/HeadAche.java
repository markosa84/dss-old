package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class HeadAche extends AbstractSymptom {

	public HeadAche(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getDescription() {
		return "Headache";
	}

	@Override
	public String getBodyPart() {
		return "Head";
	}
	


}
