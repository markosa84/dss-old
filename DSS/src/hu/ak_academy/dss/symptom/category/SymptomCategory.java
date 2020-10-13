package hu.ak_academy.dss.symptom.category;

public enum SymptomCategory {

	MOUTH("mouth"), HEAD("head"), NOSE("nose"), CHEST("chest"), WHOLEBODY("whole body"), EYES("eyes"), LEGS("legs"), HANDS("hands");

	private String label;

	private SymptomCategory(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public static SymptomCategory getByLabel(String label) {
	
		for (SymptomCategory symptomCategory : SymptomCategory.values()) {
			if (symptomCategory.label.equals(label)) {
				return symptomCategory;
			}
		}
		
		throw new IllegalArgumentException("No enum constant with label " + label);
	}
}
