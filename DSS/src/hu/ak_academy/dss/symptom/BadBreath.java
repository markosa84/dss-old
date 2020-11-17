package hu.ak_academy.dss.symptom;

import static hu.ak_academy.dss.enums.SymptomCategoryEnum.*;

import hu.ak_academy.dss.enums.SymptomStateEnum;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class BadBreath extends AbstractSymptom {

	private static final String SYMPTOMLABEL = "bad breath";
	private static final SymptomCategory SYMPTOMCATEGORY = new SymptomCategory(MOUTH);

	public BadBreath() {
		super();
	}

	public BadBreath(SymptomState symptomState) {
		super(symptomState);
	}

	@Override
	public String initLabel() {
		return SYMPTOMLABEL;
	}

	@Override
	public SymptomCategory initSymptomCategory() {
		return SYMPTOMCATEGORY;
	}

}
