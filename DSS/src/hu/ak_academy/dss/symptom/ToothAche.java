package hu.ak_academy.dss.symptom;

import static hu.ak_academy.dss.enums.SymptomCategoryEnum.*;

import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class ToothAche extends AbstractSymptom {

	private static final String SYMPTOMLABEL = "toothache";
	private static final SymptomCategory SYMPTOMCATEGORY = new SymptomCategory(MOUTH);

	public ToothAche() {
		super();
	}	
	
	public ToothAche(SymptomState symptomState) {
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
