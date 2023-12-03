package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("my car has 4 door");
		
	}

	@Override
	public void iWheel() {
		System.out.println("my car has 4 wheel");
		
		
	}

	@Override
	public void iEnginel() {
		System.out.println("my car has 2 engine");
		
	}

	@Override
	public int iSail() {
		System.out.println("my nboat has 1 sail");
		return 1;
	}

	@Override
	public String iCabin() {
		System.out.println("my boat has ac cabin");
		return "AC";
	}
	
	

}
