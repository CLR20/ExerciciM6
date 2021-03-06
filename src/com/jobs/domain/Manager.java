package com.jobs.domain;

public class Manager extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	protected String role;
	protected double rate;

	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		role = "Manager";
		rate = 1.1;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	
	@Override
	public String toString() {
		return "[Role: " + role + "; Name: " + name + "; Id: " + id + "; Address: " + address + 
				"; Phone: " + phone + "; Salary: " + salaryPerMonth + "; Payment rate: " + rate +
				"; Total payment: " + totalPaid + "]\n";
	}

}
