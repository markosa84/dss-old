package hu.ak_academy.dss.enums;

import hu.ak_academy.dss.interfaces.LabeledEnum;

public enum SymptomStateEnum implements LabeledEnum {
	
	YES("Yes"), // value specifies that the symptom is checked for and it is PRESENT on the patient
	NO("No"),	// value specifies that the symptom is checked for and it is NOT present on the patient
	NC("n/c");	// value specifies that the symptom is NOT CHECKED at all

	private String label;

	private SymptomStateEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
