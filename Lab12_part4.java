interface A {
    // default void m(); // error: missing method body, or declare abstract
    default void m() {}
}
interface B { default void m() {} }
// class W implements A {}
// class W implements A, B {} // error: types A and B are incompatible;
class W implements A, B {
    public void m() {}
}

public class Lab12_part4 {
    public static void main(String[] args) {
        
    }
}
