package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.SymptomSelectorMenu;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.container.SymptomContainer;

public class SymptomCategoryMenuItem extends AbstractMenuItem {

	protected SymptomCategory symptomCategory;
	protected UserInputHandler userInputHandler;
	protected SymptomContainer symptomContainer;
	
	public SymptomCategoryMenuItem(String prefix, SymptomCategory symptomCategory, UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		super(prefix, symptomCategory.getLabel());
		this.symptomCategory = symptomCategory;
		
		this.userInputHandler = userInputHandler;
		this.symptomContainer = symptomContainer;		
	}

	public SymptomCategory getSymptomCategory() {
		return this.symptomCategory;
	}
		
	public boolean execute() {

		new SymptomSelectorMenu(userInputHandler, symptomContainer, symptomCategory).execute();

		return true; // new iteration of the main menu
	}
	
}
