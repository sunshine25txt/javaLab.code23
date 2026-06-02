class A {int i = 10;}
class B extends A {int j = 20;}
class C {}
public class Lab10 {
    public static void main(String[] args) {
        IO.println("Main Starts");
        A a = new A();
        B b = new B();
        // a = new C(); // error: incompatible types: C cannot be converted to A
        A a2 = new B();
        // B b2 = new A(); // error: incompatible types: A cannot be converted to B
        IO.println(a.i+" "+b.i+" "+a2.i);
        IO.println(b.j);        
        // IO.println(a2.j);  // error: cannot find symbol      
        // B b2 = a2; // error: incompatible types: A cannot be converted to B
        B b2 = (B)a2;
        IO.println(b2.j);
        // B b3 = (B)a; // Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
        C c = new C();
        // B b4 = (B)c; // error: incompatible types: C cannot be converted to B
    }
}
