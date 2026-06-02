class A {} class B { public String toString() { return "This is B";}

// protected void finalize() throws Throwable { IO.println("B is going to Garbage");}
// warning: [removal] finalize() in Object has been deprecated and marked for removal protected void finalize() throws Throwable
}
class P {} class Q extends P {}
public class Lab11_part3 {
    public static void main(String[] args) {
        A a = new A(); B b = new B();
        IO.println(a);
        IO.println(a.toString());
        IO.println(b.toString());
        Object o = b; IO.println(o.toString());
        IO.println(a.hashCode()); IO.println(b.hashCode());
        IO.println(a.equals(b)); A a2 = a;
        IO.println(a.equals(a2)); A a3  = new A();
        IO.println(a.equals(a3));
        // A a4  = a.clone(); //error: clone() has protected access in Object
        P p = new P(); Q q = new Q();
        IO.println(p instanceof P);
        // IO.println(p instanceof A); //  error: incompatible types: P cannot be converted to A
        IO.println(q instanceof P);
        IO.println(q instanceof Object);        
    }
}
