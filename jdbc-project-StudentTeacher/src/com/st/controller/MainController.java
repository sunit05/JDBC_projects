package com.st.controller;

import java.util.Scanner;

import com.st.dao.ViewStudent;
import com.st.dao.ViewTeacher;

public class MainController {

	public static void main(String[] args) {
		mainController();
	}

	public static void mainController() {
		Scanner sc = new Scanner(System.in);

		System.out.println("select the DB");
		System.out.println(
				"\t press 1 to access Student Database \n"
				+ "\t press 2 to access Teacher database \n \t press 9 to exit the app");
		
		int a = sc.nextInt();
		
		if(a!=1 && a!=2 && a!=9) {
			System.out.println("please enter a proper input");
		}
		
		boolean b = true;

		while (b) {

			if (a == 1) {
				System.out.println("\t \t Press 1 to add the Student"
						+ "\n \t \t Press 2 to delete the Student"
						+ "\n \t \t Press 3 to view the Student Database"
						+ "\n \t \t Press 4 to return to the main window");
				int c = sc.nextInt();
				
				if(c!=1 && c!=2 && c!=3 && c!=4) {
					System.out.println("please enter a proper input");
				}
				
				if (c == 1) {
					StudentController.addStudent();
				}
				else if(c==2) {
					StudentControllerDel.delStudent();
				}
				else if(c==3) {
					ViewStudent.viewStudent();
				}
				else if(c==4) {
					mainController();
				}
			}
			
			if (a == 2) {
				System.out.println("\t \t Press 1 to add the Teacher"
						+ "\n \t \t Press 2 to delete the Teacher"
						+ "\n \t \t Press 3 to view the Teacher Database"
						+ "\n \t \t Press 4 to return to the main window");
				int c = sc.nextInt();
				
				if(c!=1 && c!=2 && c!=3 && c!=4) {
					System.out.println("please enter a proper input");
				}
				
				if (c == 1) {
					Teacher_Controller_Add.addTeacher();
				}
				else if(c==2) {
					Teacher_Controller_Del.delTeacher();
				}
				else if(c==3) {
					ViewTeacher.viewTeacher();
				}
				else if(c==4) {
					mainController();
				}
			}
			else if (a == 9) {
				System.out.println(" successfully exited");
				b = false;
			} else {
				System.out.println("enter a valid input");
			}
		}
		sc.close();

	}
}
