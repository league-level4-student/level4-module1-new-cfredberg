package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	int doctorCount = 0;
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int cycles = patients.size();
		for (int i = 0; i < cycles; i++) {
			try {
				doctors.get(doctorCount).assignPatient(patients.get(0));
				patients.remove(0);
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				
			}
			doctorCount++;
			if (doctorCount > doctors.size()-1) {
				doctorCount = 0;
			}
		}
	}
	
}
