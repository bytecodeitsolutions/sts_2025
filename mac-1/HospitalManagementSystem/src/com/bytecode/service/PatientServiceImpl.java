package com.bytecode.service;

import java.util.List;

import com.bytecode.entity.Patient;
import com.bytecode.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepository;// null
	
	public PatientServiceImpl() {
		patientRepository=new PatientRepository();
	}
	

	@Override
	public Patient addPatient(Patient patient) {
		Patient patient2 = null;
		if (patientRepository != null) {
			patient2 = patientRepository.savePatient(patient);
		}
		return patient2;
	}

	@Override
	public String deletePatient(int patientId) {
		return  patientRepository.removePatient(patientId);
	}

	@Override
	public Patient viewPatientById(int patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> viewAllPatients() {
		
		return patientRepository.displayAllPatients();
	}

}
