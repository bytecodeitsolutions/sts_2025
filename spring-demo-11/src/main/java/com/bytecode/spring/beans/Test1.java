package com.bytecode.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Test1 {
	private int  a;
	private int  b;
	private Test2 obj;
	
	
	public void name() {
		System.out.println("hello");
		obj.m2();
	} 
}
