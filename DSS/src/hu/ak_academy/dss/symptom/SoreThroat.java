package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class SoreThroat extends AbstractSymptom {

	@Override
	public String getLabel() {
		return "Sore throat";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
