package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class BadBreath extends AbstractSymptom {

	@Override
	public String getLabel() {
		return "bad breath";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
