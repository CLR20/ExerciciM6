package com.jobs.domain;

public class Senior extends Employee {

	
	public Senior (String name, String address, String phone, double salaryPerMonth,
			IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth,paymentRate);
		
		if(salaryPerMonth*0.95>4000.0) throw new Exception("Senior employee can't earn more than 4000");
		if(salaryPerMonth*0.95<2700) throw new Exception("Senior employee can't earn less than 2700");
		
		
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		role = "Senior employee";
		rate = 0.95;
	}
	
}
