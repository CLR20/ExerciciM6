package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		String allEmployees = "";
		
		
		controller.createBoss("Pepe Boss", "Direcci�n molona", "666666666", 8000.0);
		controller.createVolunteer("Juan Volunteer", "Direcci�n molona 4", "614266666");
		controller.createManager("Pedro Employee", "Direcci�n molona 2", "665226666", 4000.0);
		controller.createSenior("Anna Senior", "Direcci�n molona 3", "625266666", 3500.0);
		controller.createMid("Marc Mid", "Direcci�n molona 3", "625266666", 2500.0);
		controller.createJunior("Montse Junior", "Direcci�n molona 3", "625266666", 1800.0);
		
		controller.payAllEmployeers();
				
		allEmployees += controller.getAllEmployees();
		
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
	}

}
