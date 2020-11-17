package hu.ak_academy.dss.disease;

import hu.ak_academy.dss.symptom.BadBreath;
import hu.ak_academy.dss.symptom.HeadAche;
import hu.ak_academy.dss.symptom.ToothAche;
import static hu.ak_academy.dss.symptom.state.SymptomState.*;

import hu.ak_academy.dss.interfaces.Symptom;

public class Test1Disease extends AbstractDisease {

	private final static Symptom[] SYMPTOMS = {
				new BadBreath(SYMPTOMSTATE_YES), 
				new ToothAche(SYMPTOMSTATE_YES),
				new HeadAche(SYMPTOMSTATE_YES)
			};
	
	public Test1Disease() {
		super(SYMPTOMS);
	}
}
