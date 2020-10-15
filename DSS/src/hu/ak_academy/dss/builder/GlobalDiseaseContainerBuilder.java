package hu.ak_academy.dss.builder;

import hu.ak_academy.dss.container.DiseaseContainer;
import hu.ak_academy.dss.disease.Disease;
import hu.ak_academy.dss.disease.Test1Disease;
import hu.ak_academy.dss.disease.Test2Disease;

public class GlobalDiseaseContainerBuilder {

	private static final Disease[] GLOBALDISEASES = { 
			new Test1Disease(), 
			new Test2Disease() 
	};

	public static DiseaseContainer build() {
		return new DiseaseContainer(GLOBALDISEASES);
	}
}
