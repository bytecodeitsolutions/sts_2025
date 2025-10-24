package com.bytecode.repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.bytecode.entity.Patient;


public class PatientRepository {
	private List<Patient> patients;

	public PatientRepository() {
		patients = new CopyOnWriteArrayList<Patient>();
		//using ListIterator
		//implement searchById 
		//exception-com.bytecode.exception--->PatientNotFoundException
	}

	public Patient savePatient(Patient patient) {
		patients.add(patient);
		return patient;
	}

	public List<Patient> displayAllPatients() {
		return patients;
	}

	public String removePatient(int patientId) {
		for (Patient p:patients) {
			if (p.getPatientId()==patientId) {
				patients.remove(p);
			}
		}
		return "patient with id " +patientId +" removed from database";
	}

}
