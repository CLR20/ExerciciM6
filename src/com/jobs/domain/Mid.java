package com.jobs.domain;

public class Mid extends Employee {

	public Mid (String name, String address, String phone, double salaryPerMonth,
			IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth,paymentRate);
		
		if(salaryPerMonth*0.8>2500.0) throw new Exception("Mid employee can't earn more than 2500");
		if(salaryPerMonth*0.8<1800) throw new Exception("Mid employee can't earn less than 1800");
		
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		role = "Mid employee";
		rate = 0.80;
	}
	
}
