package com.bytecode.service;

import java.util.List;

import com.bytecode.entity.Patient;

public interface PatientService {
	Patient addPatient(Patient patient);
	String deletePatient(int patientId);
	Patient viewPatientById(int patientId);
	List<Patient> viewAllPatients();
}
