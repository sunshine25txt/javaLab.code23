class A {int i = 10;
    {i++;}
}
class B extends A {int j = 20; int i = 30;
    {i++; super.i++;}
}

class Lab10_part2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A a2 = new B();
        // IO.println(a.i+" "+b.i+" "+a2.i);
        // a.i++;
        // IO.println(a.i+" "+b.i);
        // a = b; a.i++;
        // IO.println(a.i+" "+b.i);
        // a2.i++;
        IO.println(a.i+" "+b.i+" "+a2.i);
        // IO.println(a2.super.i); //error: cannot find symbol
    }
}
