package com.jobs.domain;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;
	protected double totalPaid=0;
	protected String role;
	protected double rate;
	protected double net;
	protected String irpf;
	protected double yGross;
	protected double yNet;
	protected double months = 12;
	protected double bonus;

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay();
	
	public abstract void netPay();
	
	public abstract void yearGross();
	
	public abstract void yearNet();
	
	public abstract void bonus();
}
