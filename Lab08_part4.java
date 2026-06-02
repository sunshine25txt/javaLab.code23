class A { int i=10;
    A() {IO.println("A()");}
    A(int i) {
        // this.i = i; //error: cannot assign initialized field 'i' before supertype constructor has been called
        // A();//error: cannot find symbol        A();
        IO.println("BeforeThis");
        this();
        this.i = i;
        IO.println("A(i)");}    
    A(String s) {IO.println("A(s)");}  
    // void A() {IO.println("mA()");}  
    void m() {
        this(); //error: explicit constructor invocation may only appear within a constructor body
    }
}
class Lab08_part4 {
    public static void main(String[] args) {
        new A(); new A(0); new A("ABC");
    }
}
