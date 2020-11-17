package hu.ak_academy.dss.disease;

import hu.ak_academy.dss.container.SymptomContainer;

public interface Disease {
	public boolean evaluate(SymptomContainer patientSymptoms);
}
