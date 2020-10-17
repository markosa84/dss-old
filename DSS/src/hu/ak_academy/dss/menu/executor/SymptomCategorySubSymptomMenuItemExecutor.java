package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.interfaces.MenuItemExecutor;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomCategorySubSymptomMenuItemExecutor implements MenuItemExecutor {

	protected UserInputHandler userInputHandler;
	protected Symptom symptom;

	public SymptomCategorySubSymptomMenuItemExecutor (UserInputHandler userInputHandler, Symptom symptom) {
		this.userInputHandler = userInputHandler;
		this.symptom = symptom;
	}

	@Override
	public boolean execute() {

		//SymptomStateMenuBuilder.build(this.userInputHandler, symptom).execute();
		
		symptom.toggleSymptomState();
				
		return true;
	}

}
