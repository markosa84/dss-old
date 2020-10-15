package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class Cough extends AbstractSymptom {

	public Cough() {
		super();
	}	
	
	public Cough(SymptomState symptomState) {
		super(symptomState);
	}
	
	@Override
	public String getLabel() {
		return "cough";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
