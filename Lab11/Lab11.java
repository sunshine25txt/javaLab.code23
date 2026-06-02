abstract class A { 
    // abstract void m() {} // error: abstract methods cannot have a body
    abstract void m();
    abstract void m2();
}  
// class B extends A {} // error: B is not abstract and does not override abstract method m() in A
class B extends A {
    void m(int a) {}
    void m() {}
    void m2() {}
}
abstract class C extends A {}
// class D extends C {} // error: D is not abstract and does not override abstract method m() in A
// class E { abstract void m(); } // error: E is not abstract and does not override abstract method m() in E

class X {int i;} class Y extends X {int j,i;} 
class Z extends Y { int i, j;
    Z() { super.j=10;  i=10; super.i=10; 
        // super.super.i=10; // error: <identifier> expected
    }
}

public class Lab11 {
    public static void main(String[] args) {
        // new A(); // error: A is abstract; cannot be instantiated
        // A a; new B(); a = new B();
    }
}
