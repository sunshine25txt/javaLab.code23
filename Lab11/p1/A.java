package p1;
// compile: javac .\p1\A.java
// run: java p1.A
public class A {
    public static void m() { IO.println("A.m()");}
    static void m2() { IO.println("A.m2()");}
    public static void main(String[] args) {
        IO.println("From p1.A.main()");
    }
}
