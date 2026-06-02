void main() {
    // Operators
    int a = 1, b = 2, c = 3;
    System.out.printf("a = %d, b = %d, c = %d\n",a,b,c);
    a = ++b + c++;
    System.out.printf("a = %d, b = %d, c = %d\n",a,b,c);
    a = 5;    a += ++a;
    IO.println(a);
    // a = ++b--; // increment/decrement cannot be used on expression error: unexpected type
    // a = (++b)--;

    int i = 4;    
    System.out.printf("%10d||%32s\n",i,Integer.toBinaryString(i));
    i >>= 2;
    System.out.printf("%10d||%32s\n",i,Integer.toBinaryString(i));
    i = -1; 
    System.out.printf("%10d||%32s\n",i,Integer.toBinaryString(i));
    i>>=8;
    System.out.printf("%10d||%32s\n",i,Integer.toBinaryString(i));
    i>>>=8;
    System.out.printf("%10d||%32s\n",i,Integer.toBinaryString(i));
    i<<=8;
    System.out.printf("%10d||%32s\n",i,Integer.toBinaryString(i));

    boolean bl = 12==12;
    IO.println(bl);
    bl = 1.5 == 1.500_000_000_000_001;
    IO.println(bl);
    bl = 1.5 == 1.500_000_000_000_000_000_000_000_001;
    IO.println(bl);
    bl = 'A'>'a';
    IO.println(bl);
}