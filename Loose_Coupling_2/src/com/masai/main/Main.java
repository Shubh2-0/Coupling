package com.masai.main;

//INTERFACE FOR MAKI THE CLASSES LOOSELY COUPLED
interface WritingInstrument{
	
	void work();
	
	
}

//DEPENDECY CLASS
class Pen implements WritingInstrument{

	@Override
	public void work() {
		
		System.out.println("student using pen");
		
	}
	
	
}

//DEPENDECY CLASS
class Pencil implements WritingInstrument{

	@Override
	public void work() {
		System.out.println("student using pencil");
		
	}
	
	
}



//DEPENDNt CLASS

/* NOW OUR STUDENT WANTS TO USE PEN , PENCIL
OR OBJECT HE CAN EASILY PASS THE OBJECT 
INTO SET METHOD BECUASE HERE OUR STUDENT CLASS
IS LOOSELY COUPLED */

class Student {
	
//	USING THE REFERENCE OF INTERFACE 
	WritingInstrument wi;
	
	public void setWi(WritingInstrument wi) {
		this.wi = wi;
	}
	
	public void doWork() {
		
		wi.work();
		
	}
	
}




public class Main  {

	public static void main(String[] args) {
	
		Student st = new Student();
		
		st.setWi(new Pen());
		
		st.doWork();
		
	}
}
