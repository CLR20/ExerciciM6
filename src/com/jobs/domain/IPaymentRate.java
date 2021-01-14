package com.jobs.domain;

public interface IPaymentRate {
	public double pay(double salaryPerMonth);	
	public double netPay(double totalPaid);
	public double yearGross (double totalPaid);
	public double yearNet(double net);
	public double bonus(double yNet);
	
}
