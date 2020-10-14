package hu.ak_academy.dss.menu;

import java.util.ArrayList;
import java.util.List;
import hu.ak_academy.dss.menu.item.SymptomStateMenuItem;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.container.SymptomContainer;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomStateMenu extends AbstractCLIMenu <SymptomStateMenuItem> {

	protected SymptomContainer symptomContainer;
	protected Symptom symptom;

	public SymptomStateMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer, Symptom symptom) {
		super(userInputHandler, menuBuilder());
		
		this.symptomContainer = symptomContainer;
		this.symptom = symptom;
	}

	@Override
	protected void displayExtrtaMenuInformation(SymptomStateMenuItem menuItem) {
		System.out.println();
	}

	@Override
	protected boolean process(SymptomStateMenuItem userChoice) {

		SymptomState chosenSymptomState = userChoice.getSymptom();
		symptom.setSymptomState(chosenSymptomState);
		
		return false; // return to the calling Menu
	}
	
	private static List<SymptomStateMenuItem> menuBuilder() {
		List<SymptomStateMenuItem> menuItems = new ArrayList<>();

		int index = 1;
		for (SymptomState symptomState : SymptomState.values()) {
			SymptomStateMenuItem menuItem =
					new SymptomStateMenuItem("" + index, symptomState);

			if (! menuItems.contains(menuItem)) {
				menuItems.add(menuItem);
				index++;
			}
		}
			
		return menuItems;
	}
	
}
