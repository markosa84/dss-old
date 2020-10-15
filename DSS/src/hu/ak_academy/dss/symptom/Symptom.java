package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public interface Symptom {

	String getLabel();

	// this should return enum Organ, not the name property of the enum
	SymptomCategory getSymptomCategory();

	boolean isChecked();
	
	// we will need to compare symptom Objects
	boolean equals(Object other);
	
	// method to get the state of the Symtpom
	SymptomState getSymptomState();

	// method to set the state of the Symtpom
	void setSymptomState(SymptomState symptomState);
}
