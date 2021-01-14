package com.jobs.domain;

public class Employee extends AbsStaffMember {

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		role = "Employee";
		rate = 0.85;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	
	@Override
	public void netPay() {
		net = paymentRate.netPay(totalPaid);
	}
	
	@Override
	public void yearGross() {
		yGross = paymentRate.yearGross(totalPaid);
	}
	
	@Override
	public void yearNet() {
		yNet = paymentRate.yearNet(net);
	}
	
	@Override
	public void bonus() {
		bonus = yNet * 0.1;
	}
	
	@Override
	public String toString() {
		return "**Role: " + role + "; Name: " + name + "; Id: " + id + "; Address: " + address + 
				"; Phone: " + phone + "; Base salary:" + salaryPerMonth + "; Payment rate: " + 
				rate + ";\n  Gross month salary: " + totalPaid + "; IRPF: " + irpf + 
				"; Net month salary: " + net + "\n" + "  Gross year salary: " + yGross + 
				"; Net year salary: " + yNet + "; 10% bonus: " + bonus + "\n";
	}

}
