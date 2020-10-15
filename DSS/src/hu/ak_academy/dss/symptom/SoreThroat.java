package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SoreThroat extends AbstractSymptom {
	
	public SoreThroat() {
		super();
	}	
	
	public SoreThroat(SymptomState symptomState) {
		super(symptomState);
	}
	
	@Override
	public String getLabel() {
		return "sore throat";
	}

	@Override
	public SymptomCategory getSymptomCategory() {
		return SymptomCategory.MOUTH;
	}

}
