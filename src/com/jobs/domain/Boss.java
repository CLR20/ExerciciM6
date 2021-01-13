package com.jobs.domain;

import com.jobs.application.PaymentFactory;
import com.jobs.domain.IPaymentRate;

public class Boss extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	protected String role;
	protected double rate;

	public Boss(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
		if(salaryPerMonth*1.5<8000) throw new Exception("Boss can't earn less than 8000");
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		role = "Boss";
		rate = 1.5;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

	@Override
	public String toString() {
		return "[Role: " + role + "; Name: " + name + "; Id: " + id + "; Address: " + address + 
				"; Phone: " + phone + "; Salary:" + salaryPerMonth + "; Payment rate: " + rate + 
				"; Total payment: " + totalPaid + "]\n";
	}
	
}

