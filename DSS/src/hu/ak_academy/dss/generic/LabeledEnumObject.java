package hu.ak_academy.dss.generic;

import java.util.EnumSet;

import hu.ak_academy.dss.interfaces.LabeledEnum;

public abstract class LabeledEnumObject <T extends Enum<T> & LabeledEnum> {
	
	private final T value;
	
	public LabeledEnumObject(T value) {
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}

	public String getLabel() {
		return this.value.getLabel();
	}

	@Override
	public final boolean equals(Object other) {
		if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof LabeledEnumObject)) return false;
	    
	    LabeledEnumObject otherLabeledEnumObject = (LabeledEnumObject) other;
	    
		return this.value == otherLabeledEnumObject.value;
	}
	
}
