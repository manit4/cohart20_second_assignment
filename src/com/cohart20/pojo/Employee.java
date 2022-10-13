package com.cohart20.pojo;

public class Employee {

		private int empId;
		private String firstName;
		private String lastName;
		private String email;
		private int salary;
		private int workX;
		
		public Employee() {
			
		}

		public Employee(int empId, String firstName, String lastName, String email, int salary, int workX) {
			super();
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.salary = salary;
			this.workX = workX;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public int getWorkX() {
			return workX;
		}

		public void setWorkX(int workX) {
			this.workX = workX;
		}
		
}
