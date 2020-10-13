package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class ToothAche extends AbstractSymptom {

	public ToothAche() {
		super(null);
	}

	public ToothAche(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getLabel() {
		return "toothache";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
