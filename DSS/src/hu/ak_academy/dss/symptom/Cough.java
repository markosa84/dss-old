package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class Cough extends AbstractSymptom {

	public Cough() {
		super(null);
	}

	public Cough(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getLabel() {
		return "cough";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
