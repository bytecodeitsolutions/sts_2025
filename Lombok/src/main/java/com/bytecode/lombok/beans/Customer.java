package com.bytecode.lombok.beans;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private String customerName;
	private int customerId;
	private long adharNumber;
	private long mobileNumber;
	private String address;

}
