package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		String allEmployees = "";
		
		
		controller.createBoss("Pepe Boss", "Dirección molona", "666666666", 8000.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666");
		controller.createManager("Pedro Employee", "Dirección molona 2", "665226666", 4000.0);
		controller.createSenior("Anna Senior", "Dirección molona 3", "625266666", 3500.0);
		controller.createMid("Marc Mid", "Dirección molona 3", "625266666", 2500.0);
		controller.createJunior("Montse Junior", "Dirección molona 3", "625266666", 1800.0);
		
		controller.payAllEmployeers();
				
		allEmployees += controller.getAllEmployees();
		
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
	}

}
