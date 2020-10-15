package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class HeadAche extends AbstractSymptom {

	@Override
	public String getLabel() {
		return "headache";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.HEAD;
	}
}
