class A {}
interface X {}
interface Y {}
class B extends A {}
class C implements X {}
class D extends A implements X {}
class E implements X, Y {}

class GA <T extends A & X> {}
// class GA <T extends X & A> {} // Error
// class GD <T extends A & B> {} // Error

class GB <T extends X & Y> {}

class M {
    public <T> void m() {}
    public <T> void m(T t) {}
    public <T> T m2(T t) { return t;}
    // public <V> void m(V t) {} // Error
    public <T> void m(T[] t) {} 
    public <T, V> void m(T t, V v) {}

    // <T> M(T t) {}
}

public class Lab16_part5 {
    public static void main(String[] args) {
        // GA<B> ga = new GA<B>(); // Error
        // GA<C> ga = new GA<C>(); // Error
        GA<D> ga = new GA<D>();
        // GB<C> gb = new GB<C>(); // Error
        GB<E> gb = new GB<E>();

        M a = new M(); 
        a.m();
        a.<Integer>m();
        a.m(10);
        a.m(10,"Hello");
        a.m(10,2.3);
    }
}
