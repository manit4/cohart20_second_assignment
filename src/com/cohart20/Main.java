package com.cohart20;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/second_assignment", "root", "root");

		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to Register, Press 2 to Login and Press 0 to Terminate the Application!!");

		int mainMenuInput = sc.nextInt();

		switch(mainMenuInput) {

		case 1: 

			System.out.println("Press 1 to Register as Admin or Press 2 to register as Normal User!!");

			int registerInput = sc.nextInt();

			System.out.println("Kindly choose UserName wisely!!");
			String username = sc.next();

			System.out.println("Kindly choose your Password!!");
			String password = sc.next();

			System.out.println("Kindly Enter your Name!!");
			String name = sc.next();

			System.out.println("Kinldy Enter your Email Address!!");
			String email = sc.next();

			ResultSet rs = null;
			
			switch(registerInput) {

			case 1:

				pstmt = conn.prepareStatement("select * from user where id = ?");

				pstmt.setString(1, username);

				rs = pstmt.executeQuery();

				if(rs.next()) {
					System.out.println("This UserName is already taken, kinldy choose another one!!");
				}
				else {
					pstmt = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?)");
					pstmt.setString(1, username);    pstmt.setString(2, password);      pstmt.setString(3, name);   pstmt.setString(4, email);
					pstmt.setString(5, "Admin");
					pstmt.execute();
				}			
				break;

			case 2:

				pstmt = conn.prepareStatement("select * from user where id = ?");

				pstmt.setString(1, username);

				rs = pstmt.executeQuery();

				if(rs.next()) {
					System.out.println("This UserName is already taken, kinldy choose another one!!");
				}
				else {
					System.out.println("inside else");
					pstmt = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?)");
					pstmt.setString(1, username);    pstmt.setString(2, password);      pstmt.setString(3, name);   pstmt.setString(4, email);
					pstmt.setString(5, "Normal User");
					pstmt.execute();
				}			
				break;

			}
		}

	}

}






//import java.util.ArrayList;
//
//import com.cohart20.pojo.Employee;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Employee e1 = new Employee();
//		e1.setEmpId(1);  e1.setFirstName("Ali");     e1.setLastName("Mohommad");    e1.setEmail("ali@gmail.com");   e1.setSalary(2000);
//		e1.setWorkX(3);
//		
//		Employee e2 = new Employee(2, "Judith", "abc", "jud@gmail.com", 4000, 2);
//		Employee e3 = new Employee(3, "Falguni", "Patel", "fal@yahoo.com", 2500, 1);
//		
//		ArrayList<Employee> employees = new ArrayList<Employee>();
//		
//		employees.add(e1);   employees.add(e2);   employees.add(e3);
//		
//		for(Employee employee : employees) {
//			
//			int salary = employee.getSalary();
//			double bonus = 0;
//			
//			if(employee.getWorkX() <=2) {
//				bonus = salary * 0.5;	
//				//System.out.println("The bonus amount for "+bonus);
//			}
//			else {
//				bonus = salary;
//				//System.out.println("The bonus amount for "+bonus);
//			}
//			
//			System.out.println("The bonus amount for "+bonus);
//			
//		}
//		
//	}
//
//}
