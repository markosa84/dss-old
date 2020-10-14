package hu.ak_academy.dss.symptom.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomContainer {
	private List<Symptom> symptoms;
	
	public SymptomContainer() {
		this.symptoms = new ArrayList<> ();
	}

	public SymptomContainer(Symptom[] symptoms) {
		this.symptoms = new ArrayList<> (Arrays.asList(symptoms));
	}
	
	public List<Symptom> getSymptoms() {
		return this.symptoms;
	}
	
	public void add(Symptom symptom) {
		symptoms.add(symptom);
	}

//	public List<String> getSymptomStateLabels() {
//		List<String> symptomStateLabels = new ArrayList<>();
//
//		for (SymptomState symptomState : SymptomState.values()) {
//			String label = symptomState.getLabel();
//			if (! symptomStateLabels.contains(label)) {
//				symptomStateLabels.add(label);
//			}
//		}
//		
//		return symptomStateLabels;
//	}

	public SymptomContainer filterSymptomsByCategory(SymptomCategory filter) {
		SymptomContainer filteredSymptoms = new SymptomContainer();

		for (Symptom symptom : symptoms) {
			if (symptom.getSymptomCategory() == filter) {
				filteredSymptoms.add(symptom);
			}
		}
		
		return filteredSymptoms;
	}

	public Symptom getSymptomByLabel(String label) {
		for (Symptom symptom : symptoms) {
			if (symptom.getLabel().equals(label)) {
				return symptom;
			}
		}		

		throw new IllegalArgumentException("No symptom found with label " + label);
	}
}
