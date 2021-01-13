package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String role;
	
	
	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
		
		role = "Volunteer";		
	}

	
	@Override
	public void pay() {
		//TODO		
	}

	@Override
	public String toString() {
		return "[Role: " + role + "; Name: " + name + "; Id: " + id + "; Address: " + address + 
				"; phone: " + phone + "; Salary: 0" + "; Payment rate: 0" + "; Total payment: 0" + "]\n";
	}
	
}
