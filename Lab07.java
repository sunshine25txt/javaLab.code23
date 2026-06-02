// class A { int i;
//     void m() {IO.println(i);}
//     void m2(int i)  
//     // {IO.println(i);}
//         {IO.println(this.i);}
//     // A() 
//     // {IO.println("A const.");}
//     A (int i) { this.i = i;
//         IO.println("A const. "+i);}
// }
// class A {} // error: duplicate class: A
class Lab07 {
    public static void main(String[] args) {
        IO.println("Lab07.main");
        // A a = new A();
        // IO.println(a);
        // A a2 = new A();
        // IO.println(a2);
        // A.i = 50; // ERROR
        // a.i = 10; a2.i = 20;
        // IO.println(a.i+" "+a2.i);
        // a.i += 5;
        // IO.println(a.i+" "+a2.i);
        // a = a2; a.i += 5;
        // IO.println(a.i+" "+a2.i);
        // a.m(); a2.m();
        // a.m2(50); a2.m2(60);
        // A a; // Will not execute Constructor
        // new A(); new A(); new A();
        // new A(50); new A(60);
        // A a = new B(); //error: incompatible types: B cannot be converted to A
        A a = new A();
        // B b = a; // error: incompatible types: A cannot be converted to B
        a = null;
        // B b = a;  // error: incompatible types: A cannot be converted to B
    }
}
// class A{}
// class B{}
class A{int i;}
class B{int i;}

