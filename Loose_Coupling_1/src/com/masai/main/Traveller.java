package com.masai.main;

//INTERFACE TO MAKE OUR CLASS LOOSELY COUPLED
interface Vehicle{
	
	void start();
	
}



/* LOOSE COUPLING => BASICALLY IN LOOSE COUPLING
WE USE INTERFACES OR ABTRACT CLASSES TO 
MAKE OUR CLASSES LOOSELY
COUPLED SO IN LOOSE COUPLING
IF WE DO SOME CHANGES IN DEPENCY 
SO WE DON'T HAVE TO WORRY ABOUT DO THE CHANGES IN
DEPENDENT CLASS BECUASE HERE WE USE 
INTERFACE OR ABSTRACT CLASS TO 
MAKE THE DEPENDECY LOOSELY COUPLED

DEGREE OF DEPENDENCY IS LOW 

*/

//DEPENDECY CLASS
class Bike implements Vehicle{
	
	@Override
	public void start() {
		
		System.out.println("trip start by bike");
		
	}
	
	
}


//DEPENDECY CLASS
class Car implements Vehicle{
	
	@Override
	public void start() {
		
		System.out.println("trip start by car");
		
	}
	
	
}





//DEPENDENT CLASS

/* SO HERE OUR TRAVELLER WANTS TO ANY
VEHICLE SO THEY SIMPLY PASS 
THE OBJECT OF THAT VEHICLE IN 
THE V VERIABLE */


public class Traveller {
	
//	REFERENCE OF INTERFACE 
	private Vehicle v;

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public static void main(String[] args) {
	
	Traveller t = new Traveller();
	t.setV(new Bike());
	
	t.v.start();
		
	}
	

}





