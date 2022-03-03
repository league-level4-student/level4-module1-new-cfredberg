package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {

	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

}
