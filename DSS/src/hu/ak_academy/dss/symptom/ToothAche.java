package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class ToothAche extends AbstractSymptom {

	@Override
	public String getLabel() {
		return "toothache";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
