
public class Lab13_part4 {
    public static void main(String[] args) {
        IO.println("Main Start");
        // throw new ArithmeticException(); // error: unreachable statement
        // if (true) throw new ArithmeticException();
        try {
        if (true) 
            // throw new ArithmeticException("/ by zero");
            throw new ArrayIndexOutOfBoundsException("Index");
        } 
        catch (ArithmeticException e)
        { IO.println(e); }
        catch (ArrayIndexOutOfBoundsException e)
        { IO.println(e); 
            throw e; // Re-throw
        }
        IO.println("Main End"); 
    }
}
