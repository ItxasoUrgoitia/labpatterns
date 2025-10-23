package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("aitor",	35);	
		new	PacientObserverGUI	(pacient);
		//new	PacientObserverGUI	(pacient);
		new	PacientThermometerGUI	(pacient);
		new	PacientSymptomGUI	((Covid19Pacient) pacient);
		new SemaphorGUI (pacient);
		
		Observable	pacient2=new	Covid19Pacient("eneko",	20);	
		new	PacientObserverGUI	(pacient2);
		//new	PacientObserverGUI	(pacient);
		new	PacientThermometerGUI	(pacient2);
		new	PacientSymptomGUI	((Covid19Pacient) pacient2);
		
		
		Observable	pacient3=new	Covid19Pacient("itxaso",	19);	
		new	PacientObserverGUI	(pacient3);
		//new	PacientObserverGUI	(pacient);
		new	PacientThermometerGUI	(pacient3);
		new	PacientSymptomGUI	((Covid19Pacient) pacient3);
		
		
		
	}


}
