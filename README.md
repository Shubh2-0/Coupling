# Coupling

<imag src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fentri.app%2Fblog%2Floose-coupling-vs-tight-coupling-in-java%2F&psig=AOvVaw1HL7pqKWz2Fj3fkGpiWsbX&ust=1685253565797000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJCKhvXolP8CFQAAAAAdAAAAABAM">

Coupling refers to the usage of an object by another object. It can also be termed as collaboration. This dependency of one object on another object to get some task done can be classified into the following two types −



**Tight coupling** - When an object creates the object to be used, then it is a tight coupling situation. As the main object creates the object itself, this object can not be changed from outside world easily marked it as tightly coupled objects.

**Loose coupling** - When an object gets the object to be used from the outside, then it is a loose coupling situation. As the main object is merely using the object, this object can be changed from the outside world easily marked it as loosely coupled objects.



Example - Tight Coupling

Tester.java
```
public class Tester {
   public static void main(String args[]) {
      A a = new A();

      //a.display() will print A and B
      //this implementation can not be changed dynamically
      //being tight coupling
      a.display();
   }
}

class A {
   B b;
   public A() {
      //b is tightly coupled to A
      b = new B();
   }

   public void display() {
      System.out.println("A");
      b.display();
   }
}

class B {    
   public B(){}
   public void display() {
      System.out.println("B");
   }
}
```
This will produce the following result −
```
Output
A
B
```
