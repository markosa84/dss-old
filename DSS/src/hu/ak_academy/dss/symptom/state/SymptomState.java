package hu.ak_academy.dss.symptom.state;

public enum SymptomState {
	YES("Yes"), // value specifies that the symptom is checked for and it is PRESENT on the patient
	NO("No"),	// value specifies that the symptom is checked for and it is NOT present on the patient
	NC("n/c");	// value specifies that the symptom is NOT CHECKED at all

	private String label;

	private SymptomState(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public static SymptomState getByLabel(String label) {
		
		for (SymptomState symptomState : SymptomState.values()) {
			if (symptomState.label.equals(label)) {
				return symptomState;
			}
		}
		
		throw new IllegalArgumentException("No enum constant with label " + label);
	}
}
