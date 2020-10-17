package hu.ak_academy.dss.menu.executor;

import hu.ak_academy.dss.interfaces.MenuItemExecutor;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomStateMenuItemExecutor implements MenuItemExecutor {

	private Symptom symptom;
	private SymptomState symptomState;

	public SymptomStateMenuItemExecutor(Symptom symptom, SymptomState symptomState) {
		this.symptom = symptom;
		this.symptomState = symptomState;
	}

	@Override
	public boolean execute() {

		symptom.setSymptomState(symptomState);

		return false;
	}

}
