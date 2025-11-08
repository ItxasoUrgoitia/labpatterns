package adapter;

import domain.Covid19Pacient;
import domain.Symptom;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        Covid19Pacient pacient = new Covid19Pacient("Juan", 40);
        
       
        pacient.addSymptomByName("fiebre", 3);
        pacient.addSymptomByName("tos seca", 2);
        pacient.addSymptomByName("cefalea", 1);
        pacient.addSymptomByName("astenia", 4);
        pacient.addSymptomByName("disnea", 5);
        
        Covid19PacientAdapter adapter = new Covid19PacientAdapter(pacient);
        
        SymptomNameComparator nameComparator = new SymptomNameComparator();
        SeverityIndexComparator severityComparator = new SeverityIndexComparator();
        
        System.out.println("SINTOMAK IZENAREN ARABERA ORDENATUTA");
        Iterator<Object> sortedByName = Sorting.sortedIterator(adapter, nameComparator);
        while (sortedByName.hasNext()) {
            Symptom s = (Symptom) sortedByName.next();
            System.out.println("Sintoma: " + s.getName() + ", Severity Index: " + s.getSeverityIndex());
        }
        
        System.out.println("\nSINTOMAK SEVERITY INDEX-EN ARABERA ORDENATUTA");
        
        Covid19PacientAdapter adapter2 = new Covid19PacientAdapter(pacient);
        Iterator<Object> sortedBySeverity = Sorting.sortedIterator(adapter2, severityComparator);
        while (sortedBySeverity.hasNext()) {
            Symptom s = (Symptom) sortedBySeverity.next();
            System.out.println("Sintoma: " + s.getName() + ", Severity Index: " + s.getSeverityIndex());
        }
    }
}