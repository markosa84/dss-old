package hu.ak_academy.dss.builder;

import hu.ak_academy.dss.container.MenuContainer;
import hu.ak_academy.dss.container.SymptomContainer;
import hu.ak_academy.dss.menu.GenericCLIMenu;
import hu.ak_academy.dss.menu.executor.BackCommandExecutor;
import hu.ak_academy.dss.menu.executor.DiagCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuItemExecutor;
import hu.ak_academy.dss.menu.executor.QuitCommandExecutor;
import hu.ak_academy.dss.menu.executor.SymptomCategoryMenuItemExecutor;
import hu.ak_academy.dss.menu.executor.SymptomCategorySubSymptomMenuItemExecutor;
import hu.ak_academy.dss.menu.executor.SymptomSelectorMenuItemExecutor;
import hu.ak_academy.dss.menu.item.CommandMenuItem;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.GenericMenuItem;
import hu.ak_academy.dss.menu.item.MenuItem;
import hu.ak_academy.dss.menu.item.SymptomCategoryMenuItem;
import hu.ak_academy.dss.menu.item.SymptomCategorySubSymptomMenuItem;
import hu.ak_academy.dss.menu.item.SymptomSelectorMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;

public class SymptomCategoryMenuBuilder {

	public static GenericCLIMenu build(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		return new GenericCLIMenu(userInputHandler, menuBuilder(userInputHandler,symptomContainer));
	}
	
	private static MenuContainer menuBuilder(UserInputHandler userInputHandler, SymptomContainer symptomContainer) {
		MenuContainer menuItems = new MenuContainer();
		
		menuItems.add(new DecoratorMenuItem("Symptom Category Menu"));
		menuItems.add(new DecoratorMenuItem("====================="));

		menuItems.add(new CommandMenuItem("q", "quit", new QuitCommandExecutor()));
		menuItems.add(new CommandMenuItem("m", "menu", new MenuCommandExecutor()));
		menuItems.add(new CommandMenuItem("d", "diag", new DiagCommandExecutor(symptomContainer)));
		
		int index = 1;
		for (SymptomCategory symptomCategory : SymptomCategory.values()) {

			// Only add category to menu if there are symptoms defined in that category
			int numberOfItems = symptomContainer.numberOfSymptoms(symptomCategory);
			if (numberOfItems > 0) {
				MenuItemExecutor executor =
						new SymptomCategoryMenuItemExecutor(symptomCategory,userInputHandler,symptomContainer);
				
				MenuItem menuItem =
						new SymptomCategoryMenuItem("" + index, symptomCategory.getLabel(), executor, numberOfItems);
				
				menuItems.add(menuItem);
				menuItems.add(subMenuBuilder(userInputHandler, symptomContainer, symptomCategory));
				index++;
			}
						
		}

		menuItems.add(new DecoratorMenuItem("---------------------"));
			
		return menuItems;
	}

	private static MenuContainer subMenuBuilder(UserInputHandler userInputHandler, SymptomContainer symptomContainer, SymptomCategory symptomCategory) {
		MenuContainer menuItems = new MenuContainer();

		for (Symptom symptom : symptomContainer.filterSymptoms(symptomCategory).getItems()) {
				
			MenuItemExecutor executor =
					new SymptomCategorySubSymptomMenuItemExecutor(userInputHandler,symptom);

			MenuItem menuItem =
						new SymptomCategorySubSymptomMenuItem(symptom, executor);
				
			menuItems.add(menuItem);
		}

		return menuItems;
	}
		
}
