package hu.ak_academy.dss.symptom.state;

import hu.ak_academy.dss.enums.SymptomStateEnum;
import hu.ak_academy.dss.generic.LabeledEnumObject;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.interfaces.SymptomFilter;

public class SymptomState extends LabeledEnumObject<SymptomStateEnum> implements SymptomFilter {

	public static final SymptomState SYMPTOMSTATE_NC  = new SymptomState(SymptomStateEnum.NC);
	public static final SymptomState SYMPTOMSTATE_YES = new SymptomState(SymptomStateEnum.YES);
	public static final SymptomState SYMPTOMSTATE_NO  = new SymptomState(SymptomStateEnum.NO);
	
	public SymptomState(SymptomStateEnum value) {
		super(value);
	}

	public boolean isChecked() {
		return this.getValue() != SymptomStateEnum.NC;
	}
	
	public SymptomState toggleState() {
		return new SymptomState(this.getValue().getNext());
	}

	@Override
	public boolean filter(Symptom symptom) {
		return this.equals(symptom.getSymptomState());
	}

}
