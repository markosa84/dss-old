package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.executor.MenuItemExecutor;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomCategorySubSymptomMenuItem extends SymptomSelectorMenuItem {

	public SymptomCategorySubSymptomMenuItem(Symptom symptom, MenuItemExecutor menuItemExecutor) {
		super(NO_PREFIX, symptom,  menuItemExecutor);
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

}
