package com.jobs.domain;

public class Junior extends Employee {

	public Junior (String name, String address, String phone, double salaryPerMonth,
			IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth,paymentRate);
		
		if(salaryPerMonth*0.85>1600.0) throw new Exception("Junior employee can't earn more than 1600");
		if(salaryPerMonth*0.85<900) throw new Exception("Junior employee can't earn less than 900");
		
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		role = "Junior employee";
		rate = 0.85;
		irpf = "2%";
	}
	
}
