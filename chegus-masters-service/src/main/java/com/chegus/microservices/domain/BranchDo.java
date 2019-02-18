package com.chegus.microservices.domain;

public class BranchDo {
	public BranchDo() {
		
	}
	public BranchDo(String branchId, String branchName, String address) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.address = address;
	}
	private String branchId;
	private String branchName;
	private String address;
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "BranchDo [branchId=" + branchId + ", branchName=" + branchName + ", address=" + address + "]";
	}
}
