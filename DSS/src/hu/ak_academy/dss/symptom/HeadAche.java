package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class HeadAche extends AbstractSymptom {

	public HeadAche() {
		super();
	}	
	
	public HeadAche(SymptomState symptomState) {
		super(symptomState);
	}
	
	@Override
	public String getLabel() {
		return "headache";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.HEAD;
	}
}
