package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String role;
	protected double gobWage;
	protected double net;
	
	
	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
		
		role = "Volunteer";		
	}

	
	@Override
	public void pay() {
		gobWage = 300.0;		
	}
	@Override
	public void netPay() {
		net = gobWage; 
	}
	
	@Override
	public void yearGross() {
		yGross = gobWage * months;
	}
	
	@Override
	public void yearNet() {
		yNet = net * months;
	}
	
	@Override
	public void bonus() {		
	}

	@Override
	public String toString() {
		return "**Role: " + role + "; Name: " + name + "; Id: " + id + "; Address: " + address + 
				"; Phone: " + phone + "; Gubernamental wage:" + gobWage + ";\n  Gross month salary: " + 
				totalPaid + "; IRPF: 0" + "; Net month salary: " + net + "Gross year wage: " + yGross + 
				"; Net year wage: " + yNet + "\n";
	}
	
}
