package hu.ak_academy.dss.menu;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.container.SymptomContainer;
import hu.ak_academy.dss.symptom.state.SymptomState;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class SymptomCategoryMenu extends AbstractCLIMenu {

	protected SymptomContainer symptomContainer;

	public SymptomCategoryMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		super(userInputHandler, symptomContainer.getSymptomCategoryLabels());
		
		this.symptomContainer = symptomContainer;
	}
	
	@Override
	protected void displayExtrtaMenuInformation(int index, String menuItem) {
		SymptomContainer subItems = symptomContainer.filterSymptomsByCategory(SymptomCategory.getByLabel(menuItem));

		System.out.println();
		
		int j = 1;
		for (Symptom symptom : subItems.getSymptoms()) {
			if (symptom.getSymptomState() != SymptomState.NC) {
				System.out.println("\t" 
					+ j++ 
					+ ". "
					+ symptom.getLabel() 
					+ "\t" 
					+ symptom.getSymptomState().getLabel());
			}
		}		
	}
	
	@Override
	protected void displayMenuHeader() {
		System.out.println("Symptom Category Menu");		
		System.out.println("=====================");		
	}
	
	protected boolean process(String userChoice) {
		// TBD, this is not working yet
		if (userChoice.equals("diag")) {
			System.out.println("Runing diagnostics to analyze symptoms");
		}
		
		// TBD, this is not working yet
		if (userChoice.equals("quit")) {
			return false;
		}

		System.out.println();
		
		// Launch sub-menu with the selected Symptom category
		SymptomCategory chosenCategory = SymptomCategory.getByLabel(userChoice);
		new SymptomSelectorMenu(userInputHandler, symptomContainer, chosenCategory).execute();

		return true; // just go for new iteration
	}

}
