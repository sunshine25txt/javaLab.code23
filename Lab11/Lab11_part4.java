abstract class A { abstract void m();}
class B {
    B() {
        A a = new A() { void m() {IO.println("AnnoA.m()");}};
        a.m();
        A a2 = new A() { 
            void m() {IO.println("AnnoA.m_DIFF()");}
            void m2() {IO.println("AnnoA.m2()");}
        };
        a2.m();
        // a2.m2();
    }
}

public class Lab11_part4 {
    public static void main(String[] args) {
        new B();  //new A();
        
    }
    
}
