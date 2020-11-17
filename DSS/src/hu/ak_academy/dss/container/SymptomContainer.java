package hu.ak_academy.dss.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hu.ak_academy.dss.generic.ObjectContainer;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.interfaces.SymptomFilter;
import hu.ak_academy.dss.symptom.category.SymptomCategory;
import hu.ak_academy.dss.symptom.state.SymptomState;

public class SymptomContainer extends ObjectContainer <Symptom> {
	
	public SymptomContainer() {
		super();
	}

	public SymptomContainer(Symptom[] items) {
		super(items);
	}

	public int numberOfSymptoms(SymptomFilter filter) {
		List<SymptomFilter> filterList = new ArrayList<SymptomFilter>(Arrays.asList(filter));
		return filterSymptoms(filterList).size();
	}

	public SymptomContainer filterSymptoms(SymptomFilter filter) {
		List<SymptomFilter> filterList = new ArrayList<>(Arrays.asList(filter));
		return filterSymptoms(filterList);
	}

	public SymptomContainer filterSymptoms(List<SymptomFilter> filters) {
		SymptomContainer filteredSymptoms = new SymptomContainer();

		for (Symptom symptom : items) {
			if (symptom.filter(filters)) {
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
