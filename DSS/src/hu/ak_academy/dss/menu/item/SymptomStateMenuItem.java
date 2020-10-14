package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomStateMenuItem extends AbstractMenuItem {

	private Symptom symptom;
	private SymptomState symptomState;
	
	public SymptomStateMenuItem(String prefix, Symptom symptom, SymptomState symptomState) {
		super(prefix, symptomState.getLabel());
		
		this.symptom = symptom;
		this.symptomState = symptomState;
	}

	public SymptomState getSymptomState() {
		return this.symptomState;
	}

	@Override
	public boolean execute() {

		symptom.setSymptomState(symptomState);
		
		return false; // Return to the calling menu
	}
}
