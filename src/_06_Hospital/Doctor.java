package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {

	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (patients.size() == 3) {
			throw new DoctorFullException();
		}
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

}
