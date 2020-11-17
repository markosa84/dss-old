package hu.ak_academy.dss.symptom;

import java.util.List;

import hu.ak_academy.dss.enums.SymptomStateEnum;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.interfaces.SymptomFilter;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public abstract class AbstractSymptom implements Symptom {

	// Property to store the result (state) of the symptom
	private SymptomState symptomState;
	private final SymptomCategory symptomCategory;
	private final String label;

	// Default state of the symptom is not checked
	public AbstractSymptom() {
		this(SymptomState.SYMPTOMSTATE_NC);
	}
	
	public AbstractSymptom(SymptomState symptomState) {
		this.symptomState = symptomState;
		this.symptomCategory = initSymptomCategory();
		this.label = initLabel();
	}

	public abstract String initLabel();
	public abstract SymptomCategory initSymptomCategory();

	
	public String getLabel() {
		return this.label;
	}
		
	public SymptomCategory getSymptomCategory() {
		return this.symptomCategory;
	}
	
	
	// method to get the state of the Symtpom
	public final SymptomState getSymptomState() {
		return this.symptomState;
	};

	// method to set the state of the Symtpom
	public final void setSymptomState(SymptomState symptomState) {
		this.symptomState = symptomState;
	};

	
	public final void toggleSymptomState() {
		this.symptomState = this.symptomState.toggleState();
	};
	
	public final boolean isChecked() {
		return this.symptomState.isChecked();
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

	public boolean filter(List<SymptomFilter> symptomFilters) {
		
		for (SymptomFilter symptomFilter : symptomFilters) {
			if (symptomFilter.filter(this) == true) {
				return true;
			} 
		}
		
		return false;
	}

}
