package hu.ak_academy.dss.builder;

import hu.ak_academy.dss.container.SymptomContainer;
import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.symptom.BadBreath;
import hu.ak_academy.dss.symptom.Cough;
import hu.ak_academy.dss.symptom.HeadAche;
import hu.ak_academy.dss.symptom.SoreThroat;
import hu.ak_academy.dss.symptom.ToothAche;

public class GlobalSymptomContainerBuilder {

	private static final Symptom[] GLOBALSYMPTOMS = { 
			new BadBreath(), 
			new Cough(), 
			new ToothAche(),
			new SoreThroat(),
			new HeadAche()
	};
	
	public static SymptomContainer build() {
		return new SymptomContainer (GLOBALSYMPTOMS);
	}
}
