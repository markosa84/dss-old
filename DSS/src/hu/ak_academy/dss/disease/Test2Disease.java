package hu.ak_academy.dss.disease;

import static hu.ak_academy.dss.symptom.state.SymptomState.SYMPTOMSTATE_YES;

import hu.ak_academy.dss.interfaces.Symptom;
import hu.ak_academy.dss.symptom.Cough;
import hu.ak_academy.dss.symptom.HeadAche;
import hu.ak_academy.dss.symptom.SoreThroat;

public class Test2Disease extends AbstractDisease {

	private final static Symptom[] SYMPTOMS = {
			new Cough(SYMPTOMSTATE_YES), 
			new SoreThroat(SYMPTOMSTATE_YES),
			new HeadAche(SYMPTOMSTATE_YES)
		};

	public Test2Disease() {
		super(SYMPTOMS);
	}
}
