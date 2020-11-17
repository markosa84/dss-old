package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.builder.SymptomStateMenuBuilder;
import hu.ak_academy.dss.interfaces.MenuItemExecutor;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;

public class SymptomSelectorMenuItemExecutor implements MenuItemExecutor {

	protected UserInputHandler userInputHandler;
	protected Symptom symptom;

	public SymptomSelectorMenuItemExecutor(UserInputHandler userInputHandler, Symptom symptom) {
		this.userInputHandler = userInputHandler;
		this.symptom = symptom;
	}

	@Override
	public boolean execute() {

		SymptomStateMenuBuilder.build(this.userInputHandler, this.symptom).execute();
	
		return true;
	}
}
