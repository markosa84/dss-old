package hu.ak_academy.dss.menu;

import hu.ak_academy.dss.menu.container.MenuContainer;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.SymptomSelectorMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.container.SymptomContainer;

public class SymptomSelectorMenu extends AbstractCLIMenu  {
	
	public SymptomSelectorMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer, SymptomCategory symptomCategory) {
		super(userInputHandler, menuBuilder(symptomCategory, userInputHandler, symptomContainer));
	}

	private static MenuContainer menuBuilder(SymptomCategory symptomCategory, UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		
		MenuContainer menuItems = new MenuContainer();

		menuItems.add(new DecoratorMenuItem("Symptoms of the " + symptomCategory.getLabel()));
		menuItems.add(new DecoratorMenuItem("====================="));

		int index = 1;
		for (Symptom symptom : symptomContainer.filterSymptomsByCategory(symptomCategory).getSymptoms()) {
				SymptomSelectorMenuItem menuItem =
						new SymptomSelectorMenuItem("" + index, symptom, userInputHandler);
				
				if (! menuItems.contains(menuItem)) {
					menuItems.add(menuItem);
					index++;
				}
			}

		menuItems.add(new DecoratorMenuItem("---------------------"));
			
		return menuItems;
	}

}
