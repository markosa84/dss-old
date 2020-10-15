package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class ToothAche extends AbstractSymptom {
	
	public ToothAche() {
		super();
	}	
	
	public ToothAche(SymptomState symptomState) {
		super(symptomState);
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
