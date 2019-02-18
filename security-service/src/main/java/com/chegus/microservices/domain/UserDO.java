package com.chegus.microservices.domain;

public class UserDO {
	public UserDO() {
		super();
	}
	public UserDO(String userId, String empId, String empName) {
		super();
		this.userId = userId;
		this.empId = empId;
		this.empName = empName;
	}
	private String userId;
	private String empId;
	private String empName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
