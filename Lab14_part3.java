public class Lab14_part3 {
    public static void main(String[] args) throws Exception {
        try {NullPointerException n = new NullPointerException();
        ArithmeticException a = new ArithmeticException();
        a.initCause(n);
        // a.initCause(n); // java.lang.IllegalStateException: Can't overwrite cause with java.lang.NullPointerException
        Exception e = new Exception("MSG",a);
        throw e;} catch (Exception e) {
            // IO.println(e);
            // IO.println(e.getCause());
            // IO.println(e.getCause().getCause());
            IO.println(e);
            var c = e.getCause();
            while (c != null) {
                IO.println(c);
                c = c.getCause();  
            }
        }
    }
}
