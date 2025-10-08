package com.bytecode.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *   try with resources:
 *   -------------------
 *   
 *  
 *   AutoCloseable
 *   
 *   try{
 *       
 *   }
 *   catch(){
 *   
 *   }
 *   finally{
 *     cleanup code 
 *   }
 *   
 *   ========================
 *   
 *   try(Connection  con=new Connection(); Scanner s1=new Scanner();){
 *   
 *   
 *   }
 *   
 *   
 * */
public class ExceptionDemo1 {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con=DriverManager.getConnection(null, null, null);){
			con.createStatement();
		}
		

	}

}
