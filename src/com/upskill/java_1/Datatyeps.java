package com.upskill.java_1;

public class Datatyeps {

	public static void main(String[] args) {
		
       System.out.println("Hello world, this is Syf");
       int a = 5;
       
       int b = 10;
       
       int sum = a+b;

      System.out.println(sum);

      String city = "Newyork";

      System.out.println(city);
    
      boolean isHalal = true;
      System.out.println(isHalal);

	
	}
     


}



[6:17 PM, 7/23/2023] Rasal Vai  IT: package com.upskill.java_1;

public class MethodType {
	
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
}
[6:41 PM, 7/23/2023] Rasal Vai  IT: package com.upskill.java_1;

public class MethodType {
	
	/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */

	public static void main(String[] args) {
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
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);	
	}
	
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
}








