package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.menu.builder.SymptomStateMenuBuilder;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;

public class SymptomSelectorMenuItemExecutor extends AbstractMenuItemExecutor {

	protected UserInputHandler userInputHandler;
	protected Symptom symptom;

	public SymptomSelectorMenuItemExecutor(UserInputHandler userInputHandler, Symptom symptom) {
		this.userInputHandler = userInputHandler;
		this.symptom = symptom;
	}

	@Override
	public boolean execute() {

		SymptomStateMenuBuilder.build(this.userInputHandler, this.symptom).execute();
	
		return false;
	}
}
