package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	String role;
	static double pay;
	static double net;
	protected static double yGross;
	protected static double yNet;
	protected static double months = 12;
	protected static double bonus;
		
	public static IPaymentRate createPaymentRateBoss() {
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
			@Override
			public double netPay(double totalPaid) {
				return net = totalPaid * 0.68;
			}
			
			@Override
			public double yearGross(double totalPaid) {
				return yGross = totalPaid * months;
			}
			
			@Override
			public double yearNet(double net) {
				return yNet = net * months;
			}
			
			@Override
			public double bonus(double yNet) {
				return bonus = yNet * 0.1;
			}
			
		};	
	}
			
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				pay = salaryPerMonth*1.1; 
				return pay;
			}
			@Override
			public double netPay(double d) {
				return net = pay * 0.74;
			}
			
			@Override
			public double yearGross(double totalPaid) {
				return yGross = totalPaid * months;
			}
			
			@Override
			public double yearNet(double net) {
				return yNet = net * months;
			}
			
			@Override
			public double bonus(double yNet) {
				return bonus = yNet * 0.1;
			}			
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85; 
			}
			@Override
			public double netPay(double d) {
				return net = pay * 0.76;
			}
			@Override
			public double yearGross(double totalPaid) {
				return yGross = totalPaid * months;
			}
			
			@Override
			public double yearNet(double net) {
				return yNet = net * months;
			}
			
			@Override
			public double bonus(double yNet) {
				return bonus = yNet * 0.1;
			}
		};
	}
	
	
	public static IPaymentRate createPaymentRateSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.95; 
			}
			@Override
			public double netPay(double d) {
				return pay * 0.76;
			}
			@Override
			public double yearGross(double totalPaid) {
				return yGross = totalPaid * months;
			}
			
			@Override
			public double yearNet(double net) {
				return yNet = net * months;
			}
			
			@Override
			public double bonus(double yNet) {
				return bonus = yNet * 0.1;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.90; 
			}
			@Override
			public double netPay(double d) {
				return pay * 0.85;
			}
			@Override
			public double yearGross(double totalPaid) {
				return yGross = totalPaid * months;
			}
			
			@Override
			public double yearNet(double net) {
				return yNet = net * months;
			}
			
			@Override
			public double bonus(double yNet) {
				return bonus = yNet * 0.1;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85; 
			}
			@Override
			public double netPay(double d) {
				return pay * 0.98;
			}
			@Override
			public double yearGross(double totalPaid) {
				return yGross = totalPaid * months;
			}
			
			@Override
			public double yearNet(double net) {
				return yNet = net * months;
			}
			
			@Override
			public double bonus(double yNet) {
				return bonus = yNet * 0.1;
			}
		};
	}
	
}
