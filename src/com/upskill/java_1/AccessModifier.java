package com.upskill.java_1;

public class AccessModifier {

	// public - Any class can access
	// private - only same class can access
	// private - only same class can access
	// default - class in same package can access
	
	
	public static class MethodType {
		
		/* 	Types of Methods
		 
		1.Void Method
		2.Static Method
		3.Return Type Method  
	 */

		public static void main(String[] args) {
			MethodType obj = new MethodType();
			obj.annualIncomeVoid();
			
			weeklyIncomeStatic();
		}
		
		static int hourlyIncome = 65;
		
		//void method
		public void annualIncomeVoid(){
			int calculateAnnualIncome = hourlyIncome * 2000;
			System.out.println("My Annual Income = " + calculateAnnualIncome);	
		}
		
		//static method 
		public static void weeklyIncomeStatic(){
			int calculateWeeklyIncome = hourlyIncome * 40;
			System.out.println("My Weekly Income = " + calculateWeeklyIncome);	
		}

		public String monthlyIncomeReturn() {
			// TODO Auto-generated method stub
			return null;
		}
	}
 public static class MethodType1 {
		
		/* 	Types of Methods
		 
		1.Void Method
		2.Static Method
		3.Return Type Method  
	 */

		public void main(String[] args) {
			MethodType obj = new MethodType();
			obj.annualIncomeVoid();
			
			weeklyIncomeStatic();
			
			System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		}
		
		static int hourlyIncome = 65;
		
		//void method
		public void annualIncomeVoid(){
			int calculateAnnualIncome = hourlyIncome * 2000;
			System.out.println("My Annual Income = " + calculateAnnualIncome);	
		}
		
		//static method 
		public void weeklyIncomeStatic(){
			int calculateWeeklyIncome = hourlyIncome * 40;
			System.out.println("My Weekly Income = " + calculateWeeklyIncome);	
		}
		
		//return type method
		public int monthlyIncomeReturn(){
			int calculateMonthlyIncome = hourlyIncome * 180;
			return calculateMonthlyIncome;
		}
	}
	
	
}  













