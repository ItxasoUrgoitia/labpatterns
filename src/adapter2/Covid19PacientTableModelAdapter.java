package adapter2;

import java.util.Iterator;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return columnNames.length;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  if (row < 0 || row >= getRowCount() || col < 0 || col >= getColumnCount()) {
	            return null;
	        }
	        
	        Iterator<Symptom> iterator = pacient.getSymptoms().iterator();
	        Symptom symptom = null;
	        
	        // Lortu errenkadako sintoma
	        for (int i = 0; i <= row; i++) {
	            if (iterator.hasNext()) {
	                symptom = iterator.next();
	            }
	        }
	        
	        if (symptom == null) {
	            return null;
	        }
	        
	        // Itzuli zutabeko balioa
	        switch (col) {
	            case 0: // Symptom zutabea
	                return symptom.getName();
	            case 1: // Weight zutabea
	                return pacient.getWeight(symptom);
	            default:
	                return null;
	                
	        }
	  }
	}