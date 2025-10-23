package factory;

import domain.Symptom;

public interface iFactory {
	Symptom createSymptom(String name);
}
