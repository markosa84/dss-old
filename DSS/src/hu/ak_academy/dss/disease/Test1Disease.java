package hu.ak_academy.dss.disease;

import hu.ak_academy.dss.symptom.BadBreath;
import hu.ak_academy.dss.symptom.HeadAche;
import hu.ak_academy.dss.symptom.Symptom;
import hu.ak_academy.dss.symptom.ToothAche;
import static hu.ak_academy.dss.symptom.state.SymptomState.*;

public class Test1Disease extends AbstractDisease {

	private final static Symptom[] SYMPTOMS = {
				new BadBreath(YES), 
				new ToothAche(YES),
				new HeadAche(YES)
			};
	
	public Test1Disease() {
		super(SYMPTOMS);
	}
}
