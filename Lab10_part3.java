class A { 
    A() {IO.println("A()");}
    {IO.println("B1");}
    // A(int m) {} // error: constructor A in class A cannot be applied to given types;
}
class B extends A { int j = 20;
    {IO.println("B2");}
    B() { //super(1);
        int k = 100; k++;
        IO.println("Before Super");
        // j++; // error: cannot reference j before supertype constructor has been called
        super();
        // super(); // error: redundant explicit constructor invocation
        IO.println("B()");
    }    
}
class C extends B {
    C() {IO.println("C()");}
}
public class Lab10_part3 {
    public static void main(String[] args) {
        IO.println("Main Start");
        // new A();
        // new B();
        new C();
    }
}
