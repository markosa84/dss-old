package hu.ak_academy.dss.menu.executor;

import java.util.Arrays;

import hu.ak_academy.dss.symptom.container.SymptomContainer;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class DiagCommandExecutor extends AbstractMenuItemExecutor {

	private SymptomContainer symptomContainer;
	
	public DiagCommandExecutor(SymptomContainer symptomContainer) {
		this.symptomContainer = symptomContainer;
	}

	@Override
	public boolean execute() {
		System.out.println();
		
		SymptomContainer patientSymptoms = symptomContainer.filterSymptomsByState(Arrays.asList(SymptomState.YES,SymptomState.NO));
		if (patientSymptoms.numberOfSymptomsByState(SymptomState.YES) == 0) {
			System.out.println("There are no positive symptoms selected for the patient!");
		} else {
			System.out.println("Runing analisys on the following symptoms:");
			System.out.println(patientSymptoms);
		}
		
		return true;
	}

}
