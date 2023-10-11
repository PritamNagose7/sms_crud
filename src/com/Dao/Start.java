package com.Dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException {

		System.out.println("                                      ");
		System.out.println("Wellcome to student management portal");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("Press 1 to insert the student ");
			System.out.println("Press 2 to delete the student ");
			System.out.println("press 3 to display the student ");
			System.out.println("Press 4 to update the student");
			System.out.println("press 5 to exit portal ");
			
			int c = Integer.parseInt(br.readLine());
			
			if (c == 1) {
				// insert data into database
				
				System.out.print("Enter student name : ");
				String usename = br.readLine();
				
				System.out.print("Enter student password : ");
				String password = br.readLine();
				
				System.out.print("Enter student email : ");
				String email = br.readLine();
				
				System.out.print("Enter student phone : ");
				String phone = br.readLine();
				
				//create setter and getter class object to store student data
				
				SG s = new SG(usename, password, email, phone);
				boolean answre = insert.insertintodatabase(s);
				
				if (answre) {
					System.out.println("student is added successfully...");
					System.out.println("                                ");
				}else {
					System.out.println("somethig wrong ...");
				}
				//System.out.println(s);
				
				
				
			}else if (c == 2) {
				//delete student
				
				System.out.println("Enter student id to delete :");
				int userId = Integer.parseInt(br.readLine());
				boolean f = Delete.deletestudentintodatabases(userId);

				if (f) {
					System.out.println("Student are deleted...");
				} else {
					System.out.println("Something get wrong...");
				}
				
			}else if (c == 3) {
				//display student data
				Display.showAlluser();
				
				
			}else if (c == 4) {
				//update student data
			

				
			} else if (c == 5) {
				//exit portal 
				break;
			}
		}
		System.out.println("Thank you for using my application...");
	}
}
