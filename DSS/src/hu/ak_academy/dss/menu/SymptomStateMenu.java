package hu.ak_academy.dss.menu;

import hu.ak_academy.dss.menu.container.MenuContainer;
import hu.ak_academy.dss.menu.item.DecoratorMenuItem;
import hu.ak_academy.dss.menu.item.SymptomStateMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomStateMenu extends AbstractCLIMenu {

	public SymptomStateMenu(UserInputHandler userInputHandler, Symptom symptom) {
		super(userInputHandler, menuBuilder(symptom));
	}
	
	private static MenuContainer menuBuilder(Symptom symptom) {
		MenuContainer menuItems = new MenuContainer();

		menuItems.add(new DecoratorMenuItem("Values for " + symptom.getLabel()));
		menuItems.add(new DecoratorMenuItem("====================="));

		int index = 1;
		for (SymptomState symptomState : SymptomState.values()) {
			SymptomStateMenuItem menuItem =
					new SymptomStateMenuItem("" + index, symptom, symptomState);

			if (! menuItems.contains(menuItem)) {
				menuItems.add(menuItem);
				index++;
			}
		}

		menuItems.add(new DecoratorMenuItem("---------------------"));
	
		return menuItems;
	}

}
