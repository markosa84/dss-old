package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.builder.SymptomStateMenuBuilder;
import hu.ak_academy.dss.menu.userinputhandler.UserInputHandler;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomCategorySubSymptomMenuItemExecutor extends AbstractMenuItemExecutor {

	protected UserInputHandler userInputHandler;
	protected Symptom symptom;

	public SymptomCategorySubSymptomMenuItemExecutor (UserInputHandler userInputHandler, Symptom symptom) {
		this.userInputHandler = userInputHandler;
		this.symptom = symptom;
	}

	@Override
	public boolean execute() {

		//SymptomStateMenuBuilder.build(this.userInputHandler, symptom).execute();
		
		if (symptom.getSymptomState() == SymptomState.NC) {
			symptom.setSymptomState(SymptomState.YES);
		} else if (symptom.getSymptomState() == SymptomState.YES) {
			symptom.setSymptomState(SymptomState.NO);
		} else {
			symptom.setSymptomState(SymptomState.NC);
		}
		
		return true;
	}

}
