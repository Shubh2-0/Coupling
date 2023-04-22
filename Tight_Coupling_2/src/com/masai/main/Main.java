package com.masai.main;




//DEPENDENCY CLASS
class Pen{

	public void writing() {
		System.out.println("student using pen");
	}
	
	
}

//DEPENDENT CLASS
/* NOW OUR STUDENT WANTS TO USE PENCIL INSTEAD OF PEN 
SO WE NEED TO DO SOME CHANGES IN STUDENT CLASS 
BECUASE NOW OUR STUDENT CLASS IS TIGHT COUPLED WITH 
//PEN CLASS */

class Student{
	
	Pen pen;
	
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	
	public void work() {
		pen.writing();
	}
	
}







public class Main {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setPen(new Pen());
		
		st.work();
		
	}
}
