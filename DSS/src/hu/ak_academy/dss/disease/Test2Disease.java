package hu.ak_academy.dss.disease;

import static hu.ak_academy.dss.symptom.state.SymptomState.YES;

import hu.ak_academy.dss.symptom.Cough;
import hu.ak_academy.dss.symptom.HeadAche;
import hu.ak_academy.dss.symptom.SoreThroat;
import hu.ak_academy.dss.symptom.Symptom;

public class Test2Disease extends AbstractDisease {

	private final static Symptom[] SYMPTOMS = {
			new Cough(YES), 
			new SoreThroat(YES),
			new HeadAche(YES)
		};

	public Test2Disease() {
		super(SYMPTOMS);
	}
}
