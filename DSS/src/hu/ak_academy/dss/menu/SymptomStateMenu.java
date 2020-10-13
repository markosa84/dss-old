package hu.ak_academy.dss.menu;

import java.util.List;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.container.SymptomContainer;
import hu.ak_academy.dss.symptom.state.SymptomState;
import hu.ak_academy.dss.userinputhandler.UserInputHandler;

public class SymptomStateMenu extends AbstractCLIMenu {

	protected SymptomContainer symptomContainer;
	protected Symptom symptom;

	public SymptomStateMenu(UserInputHandler userInputHandler, SymptomContainer symptomContainer, Symptom symptom) {
		super(userInputHandler, symptomContainer.getSymptomStateLabels());
		
		this.symptomContainer = symptomContainer;
		this.symptom = symptom;
	}

	@Override
	protected void displayExtrtaMenuInformation(int index, String menuItem) {
		System.out.print(" ");
	}

	@Override
	protected boolean choose() {
		return process(userInputHandler.getUserChoice(this.menuItems, "Please specify the value for the selected Symptom: "));
	}

	@Override
	protected boolean process(String userChoice) {

		SymptomState chosenSymptomState = SymptomState.getByLabel(userChoice);
		symptom.setSymptomState(chosenSymptomState);
		
		return false; // return to the calling Menu
	}

}
