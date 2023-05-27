# Coupling

<img src="https://cdn.educba.com/academy/wp-content/uploads/2021/05/Coupling-in-Java.jpg">

Coupling refers to the usage of an object by another object. It can also be termed as collaboration. This dependency of one object on another object to get some task done can be classified into the following two types −

**Tight coupling** - When an object creates the object to be used, then it is a tight coupling situation. As the main object creates the object itself, this object can not be changed from outside world easily marked it as tightly coupled objects.

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


**Loose coupling** - When an object gets the object to be used from the outside, then it is a loose coupling situation. As the main object is merely using the object, this object can be changed from the outside world easily marked it as loosely coupled objects.

Example - Loose Coupling
Tester.java

```

import java.io.IOException;

public class Tester {
   public static void main(String args[]) throws IOException {
      Show b = new B();
      Show c = new C();

      A a = new A(b);          
      //a.display() will print A and B    
      a.display();

      A a1 = new A(c);
      //a.display() will print A and C    
      a1.display();
   }
}

interface Show {
   public void display();
}

class A {
   Show s;
   public A(Show s) {
      //s is loosely coupled to A
      this.s = s;
   }

   public void display() {
      System.out.println("A");
      s.display();
   }
}

class B implements Show {    
   public B(){}
   public void display() {
      System.out.println("B");
   }
}

class C implements Show {    
   public C(){}
   public void display() {
      System.out.println("C");
   }
}

```

This will produce the following result −

```
Output

A
B
A
C

```


