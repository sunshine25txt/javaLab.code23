class A { int i = 10;
    void m() {IO.println("A.m:"+i);}
    void m(String s) {
        IO.println("A.m(s)");}
}
class B extends A { int j = 20; int i = 30;
    void m(int k) {IO.println("B.m(k):"+i);}
    void m() { int i = 50;
        IO.println("B.m():"+i);
        IO.println("B.m():"+super.i);
        IO.println("B.m():"+this.i);
        // super.m();
    }
}
public class Lab10_part4 {
    public static void main(String[] args) {
        // A a = new A(); a.m();
        // B b = new B(); b.m(); b.m(0); b.m("A");
        A a2 = new B(); a2.m(); //a2.m(0);//error: incompatible types: int cannot be converted to String
        // b.super.m(); // error: cannot find symbol
        // a.super.m(); // error: cannot find symbol
        // a2.super.m(); // error: cannot find symbol

    }
}
