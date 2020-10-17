package hu.ak_academy.dss.menu.executor;

import java.util.Arrays;

import static hu.ak_academy.dss.symptom.state.SymptomState.*;

import hu.ak_academy.dss.container.SymptomContainer;
import hu.ak_academy.dss.interfaces.MenuItemExecutor;

public class DiagCommandExecutor implements MenuItemExecutor {

	private SymptomContainer symptomContainer;
	
	public DiagCommandExecutor(SymptomContainer symptomContainer) {
		this.symptomContainer = symptomContainer;
	}

	@Override
	public boolean execute() {
		System.out.println();
		
		SymptomContainer patientSymptoms = symptomContainer.filterSymptoms(Arrays.asList(SYMPTOMSTATE_YES,SYMPTOMSTATE_NO));
		if (patientSymptoms.numberOfSymptoms(SYMPTOMSTATE_YES) == 0) {
			System.out.println("There are no positive symptoms selected for the patient!");
		} else {
			System.out.println("Runing analisys on the following symptoms:");
			System.out.println(patientSymptoms);
		}
		
		return true;
	}

}
