package com.cg.eis.service;

import java.util.Scanner;

public class Service
{
	interface EmployeeService 
	{
		void getEmpDetails();
		String findInsuranceScheme(double salary,String designation);
		void displayAllEmp();
	}
	class ABC implements EmployeeService
	{
		public void getEmpDetails()
		{
			
		}
	}
}
