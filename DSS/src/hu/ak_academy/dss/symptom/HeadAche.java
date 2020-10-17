package hu.ak_academy.dss.symptom;

import static hu.ak_academy.dss.enums.SymptomCategoryEnum.*;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class HeadAche extends AbstractSymptom {

	private static final String SYMPTOMLABEL = "headache";
	private static final SymptomCategory SYMPTOMCATEGORY = new SymptomCategory(HEAD);

	public HeadAche() {
		super();
	}

	public HeadAche(SymptomState symptomState) {
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
