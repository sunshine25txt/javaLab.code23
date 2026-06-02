// final abstract class Q {} // error: illegal combination of modifiers: abstract and final
final class A {}
// class B extends A {} // error: cannot inherit from final A
class C { final void m(){}}
// class D extends C { void m() {} } //  error: m() in D cannot override m() in C
// class E {final void m();} //  error: missing method body, or declare abstract

class P { int i = 10; }
class Q extends P { int j = 20; Q() {i=40;} }
class R extends Q { int k = 30; R() {i=50; j=60;} }

// class X extends P,Q {} // error: '{' expected

public class Lab11_part2 {
    static P m(int n) {
        switch (n) {
            case 0: return new P();
            case 1: return new Q();        
            default: return new R();
        }
    }
    public static void main(String[] args) {
        var a = m(0); IO.println(a.i);
        var b = m(1); IO.println(b.i);
        // Q q = m(1); // error: incompatible types: P cannot be converted to Q
        Object o = m(1); //IO.println(o.i); // error: cannot find symbol
        var c = m(2); IO.println(c.i);
        IO.println(a.getClass().getName());
        IO.println(b.getClass().getName());
        IO.println(c.getClass().getName());


    }
    
}
