package hu.ak_academy.dss.enums;

import hu.ak_academy.dss.generic.LabeledEnumObject;
import hu.ak_academy.dss.interfaces.LabeledEnum;

public enum SymptomCategoryEnum implements LabeledEnum {

	MOUTH("mouth"),
	HEAD("head"),
	NOSE("nose"),
	CHEST("chest"),
	WHOLEBODY("whole body"),
	EYES("eyes"),
	LEGS("legs"),
	HANDS("hands");

	private String label;

	private SymptomCategoryEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
