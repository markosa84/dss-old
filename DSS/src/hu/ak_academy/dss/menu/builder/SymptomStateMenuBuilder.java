package hu.ak_academy.dss.menu.builder;

import hu.ak_academy.dss.menu.GenericCLIMenu;
import hu.ak_academy.dss.menu.container.MenuContainer;
import hu.ak_academy.dss.menu.executor.BackCommandExecutor;
import hu.ak_academy.dss.menu.executor.DiagCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuCommandExecutor;
import hu.ak_academy.dss.menu.executor.MenuItemExecutor;
import hu.ak_academy.dss.menu.executor.QuitCommandExecutor;
import hu.ak_academy.dss.menu.executor.SymptomStateMenuItemExecutor;
import hu.ak_academy.dss.menu.item.CommandMenuItem;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.GenericMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomStateMenuBuilder {
	
	public static GenericCLIMenu build(UserInputHandler userInputHandler, Symptom symptom) {
		return new GenericCLIMenu(userInputHandler, menuBuilder(symptom));
	}
	
	private static MenuContainer menuBuilder(Symptom symptom) {
		MenuContainer menuItems = new MenuContainer();

		menuItems.add(new CommandMenuItem("m", "menu", new MenuCommandExecutor()));
		menuItems.add(new CommandMenuItem("b", "back", new BackCommandExecutor()));

		menuItems.add(new DecoratorMenuItem("Values for " + symptom.getLabel()));
		menuItems.add(new DecoratorMenuItem("====================="));

		int index = 1;
		for (SymptomState symptomState : SymptomState.values()) {

			MenuItemExecutor executor =
					new SymptomStateMenuItemExecutor(symptom,symptomState);
			
			GenericMenuItem menuItem =
					new GenericMenuItem("" + index, symptomState.getLabel(), executor);

			if (! menuItems.contains(menuItem)) {
				menuItems.add(menuItem);
				index++;
			}
		}

		menuItems.add(new DecoratorMenuItem("---------------------"));
	
		return menuItems;
	}

}
