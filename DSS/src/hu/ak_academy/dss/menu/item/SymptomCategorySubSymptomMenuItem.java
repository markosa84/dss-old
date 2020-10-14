package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.SymptomStateMenu;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomCategorySubSymptomMenuItem extends SymptomSelectorMenuItem {

	public SymptomCategorySubSymptomMenuItem(Symptom symptom, UserInputHandler userInputHandler) {
		super(null, symptom, userInputHandler);
	}

	@Override
	public void display() {
		if (symptom.getSymptomState() != SymptomState.NC) {
			System.out.println("\t" + this + "\t(" + symptom.getSymptomState().getLabel() + ")");
		}
	}
	
	@Override
	public boolean validateUserInput(String userInput) {
		if (this.selectable && (this.label.equals(userInput)) ) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean execute() {

		new SymptomStateMenu(this.userInputHandler, symptom).execute();

		return true; // new iteration of the main menu
	}
}
