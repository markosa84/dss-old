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
		this.symptoms.add(symptom);
	}

	public SymptomContainer filterSymptomsByCategory(SymptomCategory filter) {
		List<SymptomCategory> filterList = new ArrayList<>(Arrays.asList(filter));
		return filterSymptomsByCategory(filterList);
	}

	public SymptomContainer filterSymptomsByCategory(List<SymptomCategory> filter) {
		SymptomContainer filteredSymptoms = new SymptomContainer();

		for (Symptom symptom : symptoms) {
			if (filter.contains(symptom.getSymptomCategory())) {
				filteredSymptoms.add(symptom);
			}
		}
		
		return filteredSymptoms;
	}

	public SymptomContainer filterSymptomsByState(SymptomState filter) {
		List<SymptomState> filterList = new ArrayList<>(Arrays.asList(filter));
		return filterSymptomsByState(filterList);
	}

	public SymptomContainer filterSymptomsByState(List<SymptomState> filter) {
		SymptomContainer filteredSymptoms = new SymptomContainer();

		for (Symptom symptom : symptoms) {
			if (filter.contains(symptom.getSymptomState())) {
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

	public int numberOfSymptoms() {
		return symptoms.size();
	}

	public int numberOfSymptomsByState(SymptomState filter) {
		List<SymptomState> filterList = new ArrayList<SymptomState>(Arrays.asList(filter));
		return numberOfSymptomsByState(filterList);
	}

	public int numberOfSymptomsByState(List<SymptomState> filter) {
		int result = 0;
		
		for (Symptom symptom : symptoms) {
			if (filter.contains(symptom.getSymptomState())) {
				result++;
			}
		}
		
		return result;
	}

	public int numberOfSymptomsByCategory(SymptomCategory filter) {
		List<SymptomCategory> filterList = new ArrayList<SymptomCategory>(Arrays.asList(filter));
		return numberOfSymptomsByCategory(filterList);	}

	public int numberOfSymptomsByCategory(List<SymptomCategory> filter) {
		int result = 0;
		
		for (Symptom symptom : symptoms) {
			if (filter.contains(symptom.getSymptomCategory())) {
				result++;
			}
		}
		
		return result;
	}

	@Override
	public String toString() {
		String result = "";

		for (Symptom symptom : symptoms) {
			result += symptom.getLabel() + " (" + symptom.getSymptomState().getLabel() + ")\n";
		}
	
		return result;
	}
	
}
