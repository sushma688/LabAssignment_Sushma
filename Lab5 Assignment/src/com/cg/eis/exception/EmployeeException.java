//Author:Sushma
//Date:11/03/2020
//Desc:Java Program to check about salary
package com.cg.eis.exception;
import java.util.*;
public class EmployeeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		int salary = sc.nextInt(); //input from the user
		sc.close();//scanner close
		try {
			/**
			 * check the employee salary is below 3000 then throw SalaryException
			 */
			if (salary < 3000) {
				throw new SalaryException();
			} else {
				System.out.println("Salary of an Employee is " + salary); // if salary above 3000 then display employee salary 
			}
		} catch (SalaryException e) {
			System.out.println(e.getMessage());// if exception occur then displaying exception message
		}
	}
}
