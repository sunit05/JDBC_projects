package com.st.controller;

import java.util.Scanner;
import com.st.dto.StudentDto;
import com.st.service.StudentService;

public class StudentController {

	public static void addStudent() {

		Scanner sc = new Scanner(System.in);
		boolean b = true;

		while (b) {
			System.out.println("\t \t enter id of student");
			int id = sc.nextInt();

			System.out.println("\t \t enter name of student");
			String s1 = sc.next();

			System.out.println("\t \t enter email student");
			String s2 = sc.next();

//			sc.close();

			StudentDto student = new StudentDto();
			student.setId(id);
			student.setName(s1);
			student.setEmail(s2);

			StudentService studentService = new StudentService();
			StudentDto s = studentService.saveStudent(student);

			if (s != null) {
				System.out.println("id : "+s.getId() + " student saved successfully");
			}

			System.out.println("\n \t press 2 to add another student record"
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
