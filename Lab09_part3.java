public class Lab09_part3 {
    static void m(int...n) {
        IO.println(n.length);
        for (int i : n) {
            IO.println(i);
        }
    }
    static void m2(String...s) {
        IO.println("m2()");
    }
    static void m(String s, int...n) {
        IO.println("m(s,n)");
    }    
    static void m(int n, int...m) {
        IO.println("m(n, m)");
    }
    static void m(boolean...b){
        IO.println("m(b)");
    }
    // static void m(String...s, int...n){} //error: varargs parameter must be the last parameter
    // static void m(String...s, int n){} //error: varargs parameter must be the last parameter
    public static void main(String[] args) {
        // m(10); m(1,2,3); m(1,2);
        // m2("A");
        m("A"); 
        // m(1); //error: reference to m is ambiguous
        // m(); // error: reference to m is ambiguous
        m(true);
        // m(1,2,3);
    }    
}
