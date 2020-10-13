package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class BadBreath extends AbstractSymptom {

	public BadBreath() {
		super(null);
	}
	
	public BadBreath(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getLabel() {
		return "bad breath";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
