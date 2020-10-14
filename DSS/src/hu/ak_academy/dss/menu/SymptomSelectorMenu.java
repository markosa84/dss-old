package hu.ak_academy.dss.menu;

import java.util.ArrayList;
import java.util.List;
import hu.ak_academy.dss.menu.item.SymptomSelectorMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.container.SymptomContainer;

public class SymptomSelectorMenu extends AbstractCLIMenu <SymptomSelectorMenuItem> {

	protected SymptomContainer symptomContainer;
	protected SymptomCategory symptomCategory;
	
	public SymptomSelectorMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer, SymptomCategory symptomCategory) {
		super(userInputHandler, menuBuilder(symptomContainer.filterSymptomsByCategory(symptomCategory)));
		
		this.symptomContainer = symptomContainer;
		this.symptomCategory = symptomCategory;
	}

	@Override
	protected void displayMenuHeader() {
		System.out.println("- " + symptomCategory.getLabel() + " -");		
	}

	@Override
	protected void displayExtrtaMenuInformation(SymptomSelectorMenuItem menuItem) {
		Symptom subItem = menuItem.getSymptom();
		System.out.println("\t" + subItem.getSymptomState().getLabel());
	}
	
	@Override
	protected boolean process(SymptomSelectorMenuItem userChoice) {

		// Launch sub-menu where the user can designate the state of the current symptom
		Symptom chosenSymptom = userChoice.getSymptom();
		new SymptomStateMenu(this.userInputHandler, symptomContainer, chosenSymptom).execute();

		return false; // return to the calling Menu
	}

	private static List<SymptomSelectorMenuItem> menuBuilder(SymptomContainer symptomContainer) {
		List<SymptomSelectorMenuItem> menuItems = new ArrayList<>();

		int index = 1;
		for (Symptom symptom : symptomContainer.getSymptoms()) {
				SymptomSelectorMenuItem menuItem =
						new SymptomSelectorMenuItem("" + index, symptom);
				
				if (! menuItems.contains(menuItem)) {
					menuItems.add(menuItem);
					index++;
				}
			}
			
		return menuItems;
	}
}
