package com.upskill.java_5;

public class AbstractclassImplementation extends Abstractclass {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
	}

	@Override
	public void iWheel() {
		System.out.println("my car has 4 wheel");
		
		
	}

	@Override
	public void iEngine() {
		System.out.println("my car has 2 Engine");
		
		
	}

	@Override
	public int iSale() {
		System.out.println("my boat has 1 sail");
		
		return 1;
	}

	@Override
	public String iCabin() {
		System.out.println("my boat has Ac cabin");
		return "AC";
	}
/*
 (parent)                   (Keyword)     (Child)           (Keyword)   (GrandChild)
 Class[R]                  extends       Class[R]
 Abstract class [R][i]     extends       Class[R][R]
 Interface [i]             implements     Class[R]
 Interface[i]              extends         	Interface [i][i]    implements Class[R][R]S
 */
}

