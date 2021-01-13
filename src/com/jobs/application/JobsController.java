package com.jobs.application;

import java.util.Arrays;
import java.util.List;

import com.jobs.domain.Boss;
import com.jobs.domain.Manager;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.domain.Senior;
import com.jobs.domain.Mid;
import com.jobs.domain.Junior;
import com.jobs.persistence.EmployeeRepository;
import com.jobs.domain.AbsStaffMember;
import com.jobs.application.PaymentFactory;

public class JobsController {

	private EmployeeRepository repository;
	String all;
	
	public JobsController(){
		repository = new EmployeeRepository();
		all = "";
	}
	
	public void createBoss(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Boss boss = new Boss(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createManager(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Manager manager = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee (name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createVolunteer(String name, String address, String phone) throws Exception{		
		Volunteer volunteer = new Volunteer(name, address, phone);
		repository.addMember(volunteer);
	}
	
	
	public void createSenior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Senior senior = new Senior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember(senior);
	}
	
	public void createMid(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Mid mid = new Mid(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember(mid);
	}
	
	public void createJunior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Junior junior = new Junior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember(junior);
	}
	

	public void payAllEmployeers() {
		List<AbsStaffMember> list = repository.getAllMembers();
        double salary = 0;
		for (AbsStaffMember a : list)
        	a.pay();			        	
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub
		//a = repository.getAllMembers().toString();
		List<AbsStaffMember> list = repository.getAllMembers();
        for (AbsStaffMember a : list)
            all = all + a;
        return all;
	}
	
}
