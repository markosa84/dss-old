package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public abstract class AbstractSymptom implements Symptom {

	protected UserInputHandler userInput;

	public AbstractSymptom(UserInputHandler userInput) {
		this.userInput = userInput;
	}

	@Override
	public String toString() {
		return getDescription() + "\n";
	}

}
