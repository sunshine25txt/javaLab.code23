class A { static int i = 10;
    static { IO.println("A:Static Block B1.");}
    { IO.println("A:Normal Block B2.");}
    static { IO.println("A:Static Block B3.");}     
    static void m() {
        IO.println("A:static m()");
    }  
}

class Lab09 {
    static {IO.println("Lab09:Static Block.");}
    public static void main(String[] args) {
        IO.println("Main starts");
        // A a = new A(); new A();
        // IO.println("A.i="+A.i);
        // IO.println("A.i="+A.i);
        // A.m();
        IO.println("Main ends");
    }
}
