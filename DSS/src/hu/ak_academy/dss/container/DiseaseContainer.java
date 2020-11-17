package hu.ak_academy.dss.container;

import hu.ak_academy.dss.disease.Disease;
import hu.ak_academy.dss.generic.ObjectContainer;

public class DiseaseContainer extends ObjectContainer <Disease> {

	public DiseaseContainer() {
		super();
	}

	public DiseaseContainer(Disease[] items) {
		super(items);
	}

}
