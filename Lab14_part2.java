class A extends Exception { int i; A(int i) {super("DetailA"+i); this.i = i;}
public String toString() {return "Detail A: "+i+"("+super.toString()+")";} }
class B extends ArithmeticException {}
class Z {} // 
public class Lab14_part2 {
    public static void main(String[] args) throws A {
        // throw new Z(); //incompatible types: Z cannot be converted to Throwable
        // throw new A();
        // throw new B();
        try {throw new A(40);}
        catch( A a) {IO.println(a);}
    }
}
