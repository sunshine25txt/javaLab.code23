public class Lab14 {
    static void m() {
        if (true) return;
        try {
            int i = 1/0;
            IO.println("NeverPrint");
        } 
        catch (ArithmeticException e) {
            IO.println(e); int j = 1/0;
            // return;
        } 
        finally {
            IO.println("Finally:F1");
        }
        IO.println("End.m()");
    }
    public static void main(String[] args) {
        IO.println("main start");
        m();
        IO.println("main end");
    }
}
