package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class SymptomCategoryMenuItem extends AbstractMenuItem {

	private SymptomCategory symptomCategory;
	
	public SymptomCategoryMenuItem(String prefix, SymptomCategory symptomCategory) {
		super(prefix, symptomCategory.getLabel());
		this.symptomCategory = symptomCategory;
	}

	public SymptomCategory getSymptomCategory() {
		return this.symptomCategory;
	}
}
