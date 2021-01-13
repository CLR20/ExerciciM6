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
		if(salaryPerMonth*1.1>5000.0) throw new Exception("Manager can't earn more than 5000");
		if(salaryPerMonth*1.1<3000) throw new Exception("Manager can't earn less than 3000");
						
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
