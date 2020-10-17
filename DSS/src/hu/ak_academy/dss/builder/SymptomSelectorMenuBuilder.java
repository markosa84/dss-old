package hu.ak_academy.dss.builder;

import hu.ak_academy.dss.container.MenuContainer;
import hu.ak_academy.dss.container.SymptomContainer;
import hu.ak_academy.dss.interfaces.MenuItemExecutor;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.menu.GenericCLIMenu;
import hu.ak_academy.dss.menu.executor.BackCommandExecutor;
import hu.ak_academy.dss.menu.executor.DiagCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuCommandExecutor;
import hu.ak_academy.dss.menu.executor.QuitCommandExecutor;
import hu.ak_academy.dss.menu.executor.SymptomCategoryMenuItemExecutor;
import hu.ak_academy.dss.menu.executor.SymptomSelectorMenuItemExecutor;
import hu.ak_academy.dss.menu.item.CommandMenuItem;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.MenuItem;
import hu.ak_academy.dss.menu.item.SymptomSelectorMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class SymptomSelectorMenuBuilder {

	public static GenericCLIMenu build(UserInputHandler userInputHandler, SymptomContainer symptomContainer, SymptomCategory symptomCategory) {
		return new GenericCLIMenu(userInputHandler, menuBuilder(symptomCategory, userInputHandler, symptomContainer));
	}

	private static MenuContainer menuBuilder(SymptomCategory symptomCategory, UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		
		MenuContainer menuItems = new MenuContainer();

		menuItems.add(new DecoratorMenuItem("Symptoms of the " + symptomCategory.getLabel()));
		menuItems.add(new DecoratorMenuItem("====================="));

		menuItems.add(new CommandMenuItem("q", "quit", new QuitCommandExecutor()));
		menuItems.add(new CommandMenuItem("m", "menu", new MenuCommandExecutor()));
		menuItems.add(new CommandMenuItem("b", "back", new BackCommandExecutor()));

		int index = 1;
		for (Symptom symptom : symptomContainer.filterSymptoms(symptomCategory).getItems()) {
				
			MenuItemExecutor executor =
					new SymptomSelectorMenuItemExecutor(userInputHandler,symptom);

			MenuItem menuItem =
						new SymptomSelectorMenuItem("" + index, symptom, executor);
				
			menuItems.add(menuItem);
			index++;
		}

		menuItems.add(new DecoratorMenuItem("---------------------"));
			
		return menuItems;
	}

}
