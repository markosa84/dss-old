package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class BadBreath extends AbstractSymptom {

	public BadBreath() {
		super();
	}	
	
	public BadBreath(SymptomState symptomState) {
		super(symptomState);
	}

	@Override
	public String getLabel() {
		return "bad breath";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
