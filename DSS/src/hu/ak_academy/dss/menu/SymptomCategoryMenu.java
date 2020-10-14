package hu.ak_academy.dss.menu;

import java.util.ArrayList;
import java.util.List;
import hu.ak_academy.dss.menu.item.SymptomCategoryMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.container.SymptomContainer;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomCategoryMenu extends AbstractCLIMenu <SymptomCategoryMenuItem> {

	protected SymptomContainer symptomContainer;

	public SymptomCategoryMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		super(userInputHandler, menuBuilder(symptomContainer));
		
		this.symptomContainer = symptomContainer;
	}
	
	protected void displayExtrtaMenuInformation(SymptomCategoryMenuItem menuItem) {
		SymptomContainer subItems = symptomContainer.filterSymptomsByCategory(menuItem.getSymptomCategory());

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
	
	protected boolean process(SymptomCategoryMenuItem userChoice) {
		// TBD, this is not working yet
		if (userChoice.equals("diag")) {
			System.out.println("Runing diagnostics to analyze symptoms");
		}
		
		// TBD, this is not working yet
		if (userChoice.equals("exit")) {
			return false;
		}

		System.out.println();
		
		// Launch sub-menu with the selected Symptom category
		SymptomCategory chosenCategory = userChoice.getSymptomCategory();
		new SymptomSelectorMenu(this.userInputHandler, symptomContainer, chosenCategory).execute();

		return true; // just go for new iteration
	}
	
	private static List<SymptomCategoryMenuItem> menuBuilder(SymptomContainer symptomContainer) {
		List<SymptomCategoryMenuItem> menuItems = new ArrayList<>();

		int index = 1;
		for (Symptom symptom : symptomContainer.getSymptoms()) {
			SymptomCategoryMenuItem menuItem =
					new SymptomCategoryMenuItem("" + index, symptom.getSymptomCategory());
			
			if (! menuItems.contains(menuItem)) {
				menuItems.add(menuItem);
				index++;
			}
		}
			
		return menuItems;
	}

}
