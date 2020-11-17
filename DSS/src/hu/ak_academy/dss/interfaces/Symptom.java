package hu.ak_academy.dss.interfaces;

import java.util.List;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public interface Symptom {

	String getLabel();
	SymptomCategory getSymptomCategory();

	boolean isChecked();
	void toggleSymptomState();

	SymptomState getSymptomState();
	void setSymptomState(SymptomState symptomState);

	boolean equals(Object other);
	public boolean filter(List<SymptomFilter> symptomFilters);
}
