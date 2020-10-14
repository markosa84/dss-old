package hu.ak_academy.dss.menu;

import hu.ak_academy.dss.menu.container.MenuContainer;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.SymptomCategoryMenuItem;
import hu.ak_academy.dss.menu.item.SymptomCategorySubSymptomMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.container.SymptomContainer;

public class SymptomCategoryMenu extends AbstractCLIMenu {

	public SymptomCategoryMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		super(userInputHandler, menuBuilder(userInputHandler,symptomContainer));
	}

	private static MenuContainer menuBuilder(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		MenuContainer menuItems = new MenuContainer();

		menuItems.add(new DecoratorMenuItem("Symptom Category Menu"));
		menuItems.add(new DecoratorMenuItem("====================="));
		
		int index = 1;
		for (Symptom symptom : symptomContainer.getSymptoms()) {
			SymptomCategoryMenuItem menuItem =
					new SymptomCategoryMenuItem("" + index, symptom.getSymptomCategory(),userInputHandler,symptomContainer);
			
			if (! menuItems.contains(menuItem)) {
				menuItems.add(menuItem);
				index++;				
			}
			
			menuItems.add(new SymptomCategorySubSymptomMenuItem(symptom,userInputHandler));
		}

		menuItems.add(new DecoratorMenuItem("---------------------"));
			
		return menuItems;
	}

}
