package hu.ak_academy.dss.disease;

import hu.ak_academy.dss.container.SymptomContainer;
import hu.ak_academy.dss.interfaces.Symptom;

public class AbstractDisease implements Disease {
	private SymptomContainer symptoms;
	
	public AbstractDisease(Symptom[] symptoms) {
		this.symptoms = new SymptomContainer(symptoms);
	}
	
	public SymptomContainer getSymptoms() {
		return this.symptoms;
	}
	
	public boolean evaluate(SymptomContainer patientSymptoms) {
		return false;
	}
}
