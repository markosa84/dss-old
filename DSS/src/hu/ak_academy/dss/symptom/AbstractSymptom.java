package hu.ak_academy.dss.symptom;

import java.util.List;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public abstract class AbstractSymptom implements Symptom {

	// Property to store the result (state) of the symptom
	protected SymptomState symptomState;

	// Default state of the symptom is not checked
	public AbstractSymptom() {
		this.symptomState = SymptomState.NC;
	}
	
	public AbstractSymptom(SymptomState symptomState) {
		this.symptomState = symptomState;
	}

	// method to get the state of the Symtpom
	public final SymptomState getSymptomState() {
		return this.symptomState;
	};

	// method to set the state of the Symtpom
	public final void setSymptomState(SymptomState symptomState) {
		this.symptomState = symptomState;
	};
	
	public final boolean isChecked() {
		return this.symptomState != SymptomState.NC;
	}

	@Override
	public String toString() {
		return getLabel();
	}
	
	// we will need to compare symptom Objects based on the actual class (if using multiple classes, and on the state of the symptom)
	@Override
	public final boolean equals(Object other) {
		if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Symptom)) return false;
	    
	    Symptom otherSymptom = (Symptom) other;
	    
		return this.getClass().equals(otherSymptom.getClass()) && this.symptomState == otherSymptom.getSymptomState();
	}

	public boolean filterByState(List<SymptomState> filter) {
		return filter.contains(symptomState);
	}
	
	public boolean filterByCategory(List<SymptomCategory> filter) {
		return filter.contains(getSymptomCategory());		
	}

}
