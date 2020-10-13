package hu.ak_academy.dss.symptom;

import java.util.ArrayList;
import java.util.List;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public interface Symptom {

	String getLabel();

	// this should return enum Organ, not the name property of the enum
	SymptomCategory getSymptomCategory();

	// we will need to compare symptom Objects
	boolean equals(Symptom otherSympthom);
	
	// method to get the state of the Symtpom
	SymptomState getSymptomState();

	// method to set the state of the Symtpom
	void setSymptomState(SymptomState symptomState);
}
