package hu.ak_academy.dss.menu.builder;

import hu.ak_academy.dss.menu.GenericCLIMenu;
import hu.ak_academy.dss.menu.container.MenuContainer;
import hu.ak_academy.dss.menu.executor.BackCommandExecutor;
import hu.ak_academy.dss.menu.executor.DiagCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuItemExecutor;
import hu.ak_academy.dss.menu.executor.QuitCommandExecutor;
import hu.ak_academy.dss.menu.executor.SymptomCategoryMenuItemExecutor;
import hu.ak_academy.dss.menu.executor.SymptomSelectorMenuItemExecutor;
import hu.ak_academy.dss.menu.item.CommandMenuItem;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.SymptomSelectorMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.container.SymptomContainer;

public class SymptomSelectorMenuBuilder {

	public static GenericCLIMenu build(UserInputHandler userInputHandler, SymptomContainer symptomContainer, SymptomCategory symptomCategory) {
		return new GenericCLIMenu(userInputHandler, menuBuilder(symptomCategory, userInputHandler, symptomContainer));
	}

	private static MenuContainer menuBuilder(SymptomCategory symptomCategory, UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		
		MenuContainer menuItems = new MenuContainer();

		menuItems.add(new CommandMenuItem("m", "menu", new MenuCommandExecutor()));
		menuItems.add(new CommandMenuItem("b", "back", new BackCommandExecutor()));

		menuItems.add(new DecoratorMenuItem("Symptoms of the " + symptomCategory.getLabel()));
		menuItems.add(new DecoratorMenuItem("====================="));

		int index = 1;
		for (Symptom symptom : symptomContainer.filterSymptomsByCategory(symptomCategory).getSymptoms()) {
				
			MenuItemExecutor executor =
					new SymptomSelectorMenuItemExecutor(userInputHandler,symptom);

			SymptomSelectorMenuItem menuItem =
						new SymptomSelectorMenuItem("" + index, symptom, executor);
				
				if (! menuItems.contains(menuItem)) {
					menuItems.add(menuItem);
					index++;
				}
			}

		menuItems.add(new DecoratorMenuItem("---------------------"));
			
		return menuItems;
	}

}
