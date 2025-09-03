package com.bytecode.jdbc.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {
	static int rows =0;
	static int i;
    public boolean insertStudent(Student student) {
        boolean inserted = false;
        String sql = "INSERT INTO students(name, age, address, phone, email) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getAddress());
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getEmail());

          rows  = ps.executeUpdate();
            inserted = rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
       
         
        return inserted;
    }
}

