package hu.ak_academy.dss.menu;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.container.SymptomContainer;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class SymptomSelectorMenu extends AbstractCLIMenu {

	protected SymptomContainer symptomContainer;
	protected SymptomCategory symptomCategory;
	
	public SymptomSelectorMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer, SymptomCategory symptomCategory) {
		super(userInputHandler, symptomContainer.filterSymptomsByCategory(symptomCategory).getSymptomLabels());
		
		this.symptomContainer = symptomContainer;
		this.symptomCategory = symptomCategory;
	}

	@Override
	protected void displayMenuHeader() {
		System.out.println("- " + symptomCategory.getLabel() + " -");		
	}

	@Override
	protected void displayExtrtaMenuInformation(int index, String menuItem) {
		Symptom subItem = symptomContainer.getSymptomByLabel(menuItem);
		System.out.println("\t" + subItem.getSymptomState().getLabel());
	}
	
	@Override
	protected boolean choose() {
		return process(userInputHandler.getUserChoice(this.menuItems, "Please select a Symptom: "));
	}

	@Override
	protected boolean process(String userChoice) {

		// Launch sub-menu where the user can designate the state of the current symptom
		Symptom chosenSymptom = symptomContainer.getSymptomByLabel(userChoice);
		new SymptomStateMenu(userInputHandler, symptomContainer, chosenSymptom).execute();

		return false; // return to the calling Menu
	}

}
