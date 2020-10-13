package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class SoreThroat extends AbstractSymptom {

	public SoreThroat() {
		super(null);
	}
	
	public SoreThroat(UserInputHandler userInput) {
		super(userInput);
	}

	@Override
	public String getLabel() {
		return "Sore throat";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
