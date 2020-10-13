package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class HeadAche extends AbstractSymptom {

	public HeadAche() {
		super(null);
	}

	public HeadAche(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getLabel() {
		return "Headache";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.HEAD;
	}
}
