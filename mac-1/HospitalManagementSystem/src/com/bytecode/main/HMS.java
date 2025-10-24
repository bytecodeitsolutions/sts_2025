package com.bytecode.main;

import com.bytecode.entity.Patient;
import com.bytecode.service.PatientService;
import com.bytecode.service.PatientServiceImpl;

public class HMS {

	public static void main(String[] args) {
		PatientService patientService=new PatientServiceImpl();
		Patient patient=new Patient(101, "Raja",24637465L , 25, "pyar_ki_bimary");
		Patient patient2=new Patient(102, "Rani",24637454L , 23, "pyar_ki_bimary");
		patientService.addPatient(patient);
		patientService.addPatient(patient2);
		patientService.viewAllPatients().forEach(System.out::println);
		
		System.out.println(patientService.deletePatient(102));
		
		patientService.viewAllPatients().forEach(System.out::println);
	}

}
