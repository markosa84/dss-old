 package hu.ak_academy.dss.symptom.category;

import hu.ak_academy.dss.enums.SymptomCategoryEnum;
import hu.ak_academy.dss.generic.LabeledEnumObject;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.interfaces.SymptomFilter;

public class SymptomCategory extends LabeledEnumObject<SymptomCategoryEnum> implements SymptomFilter {

	public SymptomCategory(SymptomCategoryEnum value) {
		super(value);
	}

	@Override
	public boolean filter(Symptom symptom) {
		return this.equals(symptom.getSymptomCategory());
	}
	
}
