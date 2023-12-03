package com.upskill.java_1;

public class variables {
	
	//Variables in Java
	//Instance OR global Variables declared in class level, outside method
	//static variable - variables belong to class and don't required creating object
	// local variable - variables declared in methods
	// Method parameter - variables used as method parameter

	public static void main(String[] args) {
		

	variables obj = new variables ();	
	

	obj.newyork();
	obj.texes();
	
	System.out.println(obj.country);
	System.out.println(president);
		
	}

	private void texes() {

		
	}

	String country = "usa";   //Instance OR global Variables declared in class level, outside method
	static String president = "Biden";
	
	
	public static void newyork(){    // local variable - variables declared in methods
	
	String city = "Queens";
	
	String police = "NYPD";
	
	System.out.println(police);
	
	
	}
		
	public static void taxas (String food){//Method parameter - passing data from outside to inside of method
		
		String city = "Austin";
		String police = "APD";
		System.out.println(police);
		System.out.println(food);
		
		
	}
	
}

