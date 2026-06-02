void main() {
    // Type Conversion
    // Widening Conversion (AUTO)
    byte b = 1; // Auto
    b = 1; // AUto
    IO.println(b);
    // b = 128; //error: incompatible types: possible lossy conversion from int to byte
    // b = 1L;  // error: incompatible types: possible lossy conversion from long to byte
    // b = b + 1; // error: incompatible types: possible lossy conversion from int to byte
    b++; // AUTO
    IO.println(b); b = 127;
    b++; IO.println(b); b = 127;
    b += 1; IO.println(b);

    short sh = 30000;
    // sh = 50000; // error: incompatible types: possible lossy conversion from int to short
    // sh = sh + 1000; // ERROR
    sh++;
    sh += 100;

    char c = '\u0996';
    IO.println(c);
    // c = 1232456; //possible lossy conversion from int to char
    // c = c + 1; // error;

    // int i = 1L; //error: incompatible types: possible lossy conversion from long to int
    int i = Integer.MAX_VALUE;
    i++;
    IO.println(i);

    float f = 2.5f;
    // f = 2.5; // error: incompatible types: possible lossy conversion from double to float

    // Narrowing Conversion
    b = (byte)128;
    sh = (short)50000;
    i = (int)1L;
    f = (float)2.5;

    b = (byte)(b + 1);

    boolean bl = true;
    // Incompatible Types
    // bl = 1; // error: incompatible types: int cannot be converted to boolean
    // bl = (boolean) 1; // error: incompatible types: int cannot be converted to boolean
    // bl = (boolean) "true"; // error: incompatible types: String cannot be converted to boolean
    // i = (int) bl; // error: incompatible types: boolean cannot be converted to int





}