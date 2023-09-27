package com.st.controller;

import java.util.Scanner;
import com.st.service.TeacherService;

public class Teacher_Controller_Del {

	public static void delTeacher() {
		Scanner sc = new Scanner(System.in);

		boolean b = true;

		while (b) {
			
			System.out.println("enter the id which you want to delete");
			int i = sc.nextInt();

			TeacherService teacherService = new TeacherService();
			boolean a = teacherService.deleteTeacher(i);

			if (a == true) {
				System.out.println(i + " deleted successfully");
			}

			System.out.println("\n \t press 2 to delete another teacher record" 
							+ "\n \t press 8 to return to main window");
			int c = sc.nextInt();

			if (c != 2 && c != 8) {
				System.out.println("please enter a proper input");
			}
			else if(c==2) {
				Teacher_Controller_Del.delTeacher();
			}
			else if(c==8) 
			{
				MainController.mainController();
			}
		}
		MainController.mainController();
		sc.close();

	}
}
