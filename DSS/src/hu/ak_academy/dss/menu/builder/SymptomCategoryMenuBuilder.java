package hu.ak_academy.dss.menu.builder;

import hu.ak_academy.dss.menu.GenericCLIMenu;
import hu.ak_academy.dss.menu.container.MenuContainer;
import hu.ak_academy.dss.menu.executor.BackCommandExecutor;
import hu.ak_academy.dss.menu.executor.DiagCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuItemExecutor;
import hu.ak_academy.dss.menu.executor.QuitCommandExecutor;
import hu.ak_academy.dss.menu.executor.SymptomCategoryMenuItemExecutor;
import hu.ak_academy.dss.menu.executor.SymptomCategorySubSymptomMenuItemExecutor;
import hu.ak_academy.dss.menu.item.CommandMenuItem;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.GenericMenuItem;
import hu.ak_academy.dss.menu.item.SymptomCategorySubSymptomMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.container.SymptomContainer;

public class SymptomCategoryMenuBuilder {

	public static GenericCLIMenu build(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		return new GenericCLIMenu(userInputHandler, menuBuilder(userInputHandler,symptomContainer));
	}
	
	private static MenuContainer menuBuilder(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		MenuContainer menuItems = new MenuContainer();

		menuItems.add(new CommandMenuItem("q", "quit", new QuitCommandExecutor()));
		menuItems.add(new CommandMenuItem("m", "menu", new MenuCommandExecutor()));
		menuItems.add(new CommandMenuItem("d", "diag", new DiagCommandExecutor()));
		menuItems.add(new CommandMenuItem("b", "back", new BackCommandExecutor()));
		
		menuItems.add(new DecoratorMenuItem("Symptom Category Menu"));
		menuItems.add(new DecoratorMenuItem("====================="));
		
		int index = 1;
		for (Symptom symptom : symptomContainer.getSymptoms()) {
			
			MenuItemExecutor executor =
					new SymptomCategoryMenuItemExecutor(symptom.getSymptomCategory(),userInputHandler,symptomContainer);
			
			GenericMenuItem menuItem =
					new GenericMenuItem("" + index, symptom.getSymptomCategory().getLabel(), executor);
			
			if (! menuItems.contains(menuItem)) {
				menuItems.add(menuItem);
				index++;				
			}
			
			menuItems.add(new SymptomCategorySubSymptomMenuItem(symptom,
					new SymptomCategorySubSymptomMenuItemExecutor(userInputHandler, symptom) ));
		}

		menuItems.add(new DecoratorMenuItem("---------------------"));
			
		return menuItems;
	}

}
