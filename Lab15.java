class A { class B{} }
class C extends A.B { C(A a){ a.super();}}
public class Lab15 {
    static void m() { //if (true) return;
        try { IO.println("Try"); System.exit(0);
        return;
    }
        finally {IO.println("Finally");}
    }
    public static void main(String[] args) {
        // m();
        A.B b = new A().new B();
        A a = new A();
        C c = new C(a);
    }
    
}
