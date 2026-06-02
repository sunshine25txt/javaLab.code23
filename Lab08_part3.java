class A {
    void m() {IO.println("m()");}
    // void m(int i) {IO.println("m(i)");}
    // void m(int abc) {IO.println("m(abc)");}
    // int m(int i) {return 10;} //error: method m(int) is already defined in class A
    // void m(byte b) {IO.println("m(b)");}
    // void m(long i) {IO.println("m(l)");}
    void m(double d) {IO.println("m(d)");}
    // void m(float f) {IO.println("m(f)");}
    void m(String s) {IO.println("m(s)");}
    void m(int i, long l) {
        IO.println("m(i,l)");
    }
    void m(int i, byte b) {
        IO.println("m(i,b)");
    }
    
}
class Lab08_part3 {
    public static void main(String[] args) {
        A a = new A(); a.m(); a.m(256);
        // a.m(10); //error: incompatible types: possible lossy conversion from int to byte
        a.m((byte)10); a.m(10l);
        a.m(10,10l); 
        a.m(10,10); a.m(10,(byte)10);
    }    
}
