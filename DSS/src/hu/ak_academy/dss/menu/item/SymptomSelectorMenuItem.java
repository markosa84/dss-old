package hu.ak_academy.dss.menu.item;

import hu.ak_academy.dss.menu.SymptomStateMenu;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;

public class SymptomSelectorMenuItem extends AbstractMenuItem {

	protected Symptom symptom;
	protected UserInputHandler userInputHandler;

	public SymptomSelectorMenuItem(String prefix, Symptom symptom, UserInputHandler userInputHandler) {
		super(prefix, symptom.getLabel());
		this.symptom = symptom;
		
		this.userInputHandler = userInputHandler;
	}

	public Symptom getSymptom() {
		return this.symptom;
	}

	public void display() {
		System.out.println(this + "\t(" + symptom.getSymptomState().getLabel() + ")");
	}

	@Override
	public boolean execute() {

		new SymptomStateMenu(this.userInputHandler, symptom).execute();

		return false; // Return to the calling menu
	}

}
