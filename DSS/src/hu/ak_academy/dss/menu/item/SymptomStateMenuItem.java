package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomStateMenuItem extends AbstractMenuItem {

	private SymptomState symptomState;
	
	public SymptomStateMenuItem(String prefix, SymptomState symptomState) {
		super(prefix, symptomState.getLabel());
		this.symptomState = symptomState;
	}

	public SymptomState getSymptom() {
		return this.symptomState;
	}

}
