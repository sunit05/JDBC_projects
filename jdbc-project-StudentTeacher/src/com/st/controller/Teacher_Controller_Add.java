package com.st.controller;

import java.util.Scanner;
import com.st.dto.TeacherDto;
import com.st.service.TeacherService;

public class Teacher_Controller_Add {

	public static void addTeacher() {

		Scanner sc = new Scanner(System.in);
		boolean b = true;

		while (b) {
			System.out.println("\t \t enter id of Teacher");
			int id = sc.nextInt();

			System.out.println("\t \t enter name of Teacher");
			String s1 = sc.next();

			System.out.println("\t \t enter email Teacher");
			String s2 = sc.next();

//			sc.close();

			TeacherDto teacher = new TeacherDto();
			teacher.setId(id);
			teacher.setName(s1);
			teacher.setEmail(s2);

			TeacherService teacherService = new TeacherService();
			TeacherDto s = teacherService.saveTeacher(teacher);

			if (s != null) {
				System.out.println("id : "+s.getId() + " Teacher saved successfully");
			}

			System.out.println("\n \t press 2 to add another Teacher record"
					+ "\n \t press 8 to return to main window");
			int a = sc.nextInt();
			
			if(a!=2 || a!=8) {
				System.out.println("please enter a proper input");
			}
			
			if (a == 8) {
				b = false;
			}
		}
//		sc.close();
		MainController.mainController();
	}
}
