package hu.ak_academy.dss.symptom;

import java.util.List;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public interface Symptom {

	String getLabel();

	boolean isChecked();
	
	// we will need to compare symptom Objects
	boolean equals(Object other);
	
	// method to get the state of the Symtpom
	SymptomState getSymptomState();

	// this should return enum Organ, not the name property of the enum
	SymptomCategory getSymptomCategory();

	// method to set the state of the Symtpom
	void setSymptomState(SymptomState symptomState);
	
	boolean filterByState(List<SymptomState> filter);
	boolean filterByCategory(List<SymptomCategory> filter);
}
