package hu.ak_academy.dss.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomContainer extends ObjectContainer <Symptom> {
	
	public SymptomContainer() {
		super();
	}

	public SymptomContainer(Symptom[] items) {
		super(items);
	}

	public SymptomContainer filterSymptoms(SymptomState filter) {
		List<SymptomState> filterList = new ArrayList<>(Arrays.asList(filter));
		return filterSymptomsByState(filterList);
	}

	public SymptomContainer filterSymptoms(SymptomCategory filter) {
		List<SymptomCategory> filterList = new ArrayList<>(Arrays.asList(filter));
		return filterSymptomsByCategory(filterList);
	}

	public int numberOfSymptoms(SymptomState filter) {
		List<SymptomState> filterList = new ArrayList<SymptomState>(Arrays.asList(filter));
		return filterSymptomsByState(filterList).size();
	}

	public int numberOfSymptoms(SymptomCategory filter) {
		List<SymptomCategory> filterList = new ArrayList<SymptomCategory>(Arrays.asList(filter));
		return filterSymptomsByCategory(filterList).size();	
	}

	public SymptomContainer filterSymptomsByState(List<SymptomState> filter) {
		SymptomContainer filteredSymptoms = new SymptomContainer();

		for (Symptom symptom : items) {
			if (symptom.filterByState(filter)) {
				filteredSymptoms.add(symptom);
			}
		}
		
		return filteredSymptoms;
	}

	public SymptomContainer filterSymptomsByCategory(List<SymptomCategory> filter) {
		SymptomContainer filteredSymptoms = new SymptomContainer();

		for (Symptom symptom : items) {
			if (symptom.filterByCategory(filter)) {
				filteredSymptoms.add(symptom);
			}
		}
		
		return filteredSymptoms;
	}

	public Symptom getSymptomByLabel(String label) {
		for (Symptom symptom : items) {
			if (symptom.getLabel().equals(label)) {
				return symptom;
			}
		}		

		throw new IllegalArgumentException("No symptom found with label " + label);
	}

	@Override
	public String toString() {
		String result = "";

		for (Symptom symptom : items) {
			result += symptom.getLabel() + " (" + symptom.getSymptomState().getLabel() + ")\n";
		}
	
		return result;
	}
	
}
