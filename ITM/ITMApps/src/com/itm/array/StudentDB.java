package com.itm.array;

public class StudentDB {
	public static String printStudentRecord(Student[] sArr) {
		for (Student student : sArr) {
			/*System.out.println(student.getRno());
			System.out.println(student.getName());*/
			System.out.println(student);
		}
		return "Data inserted successfully";
	}
}
