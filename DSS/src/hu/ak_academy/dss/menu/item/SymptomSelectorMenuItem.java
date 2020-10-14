package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.symptom.Symptom;

public class SymptomSelectorMenuItem extends AbstractMenuItem {

	private Symptom symptom;
	
	public SymptomSelectorMenuItem(String prefix, Symptom symptom) {
		super(prefix, symptom.getLabel());
		this.symptom = symptom;
	}

	public Symptom getSymptom() {
		return this.symptom;
	}

}
