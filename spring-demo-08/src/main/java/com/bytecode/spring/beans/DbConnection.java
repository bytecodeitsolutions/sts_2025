package com.bytecode.spring.beans;

public class DbConnection {
	private String driverClassName;
	private String url;
	private String userName;
	private String password;

	public DbConnection() {
		System.out.println("Database connection created");
	}

	
	public void m1() {
		System.out.println("configurations loading into connection object");
	}

	
	public void m2() {
		System.out.println("I am about to destroy so closing all the connections");
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DbConnection [driverClassName=" + driverClassName + ", url=" + url + ", userName=" + userName
				+ ", password=" + password + "]";
	}
}
