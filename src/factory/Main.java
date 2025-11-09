package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35);
		//PacientSymptomGUI psGUI1 = new PacientSymptomGUI(p1); 
		new PacientSymptomGUI(p1);
		p1.addSymptomByName("mareos", 1);
		new MedicalGUI(new Medicament("Ibuprofeno"));
		//bi horiek izango dira clienteak eta iFactory erabiliko dute objetuak sortzeko, sintomak sortzeko.
	}

}
