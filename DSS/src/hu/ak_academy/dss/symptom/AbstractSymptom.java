package hu.ak_academy.dss.symptom;

import hu.ak_academy.dss.symptom.state.SymptomState;

public abstract class AbstractSymptom implements Symptom {

	// Property to store the result (state) of the symptom, defaulting to Not Checked
	private SymptomState symptomState = SymptomState.NC;
	
	// this property is used for what exactly? Do we need it later? To be clarified w Reza
//	protected UserInputHandler userInput;
//	
//	public AbstractSymptom(UserInputHandler userInput) {
//		this.userInput = userInput;
//	}
	

	// method to get the state of the Symtpom
	public final SymptomState getSymptomState() {
		return this.symptomState;
	};

	// method to set the state of the Symtpom
	public final void setSymptomState(SymptomState symptomState) {
		this.symptomState = symptomState;
	};

	@Override
	public String toString() {
		return getLabel();
	}
	
	// we will need to compare symptom Objects based on the actual class (if using multiple classes, and on the state of the symptom)
	@Override
	public boolean equals(Object other) {
		if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Symptom)) return false;
	    
	    Symptom otherSymptom = (Symptom) other;
	    
		return this.getClass().equals(otherSymptom.getClass()) && this.symptomState == otherSymptom.getSymptomState();
	}
}
