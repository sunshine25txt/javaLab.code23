

void main() throws IOException {
    String fileContent = Files.readString(Paths.get("Input.txt"));
    IO.println(fileContent);
    for (String line:Files.readAllLines(Paths.get("Input.txt")))
        IO.println(line);
    Files.write(Paths.get("Output.txt"),
    Arrays.asList(fileContent.toUpperCase()));

    // Variables
    byte bt = 65;
    short sh = 100;
    int i = 54654;
    long l = 646414;
    float f = 12.3f;
    double d = 12.123;
    boolean bl = true;

    // IO.println("Byte: "+bt);
    // IO.println("Byte Max: "+Byte.MAX_VALUE);
    // IO.println("Byte Min: "+Byte.MIN_VALUE);

    // IO.println("Short: "+sh);
    // IO.println("Short Max: "+Short.MAX_VALUE);
    // IO.println("Short Min: "+Short.MIN_VALUE);
    
    // IO.println("Integer: "+i);
    // IO.println("Integer Max: "+Integer.MAX_VALUE);
    // IO.println("Integer Min: "+Integer.MIN_VALUE);
    
    // IO.println("Long: "+l);
    // IO.println("Long Max: "+Long.MAX_VALUE);
    // IO.println("Long Min: "+Long.MIN_VALUE);
    
    // IO.println("Character: "+l);
    // IO.println("Character Max: "+(int)Character.MAX_VALUE);
    // IO.println("Character Min: "+(int)Character.MIN_VALUE);

    // try out for float and double

    int _ = 4546; // Does not gives Error but cannot be used
    int __ = 4546;
    // int in = _ + 12; // Error
    // IO.println(_); // Error
    // IO.print(__);

    // var v; //cannot use 'var' on variable without initializer
    // var v1 = 10, v2 = 20; // error: 'var' is not allowed in a compound declaration
    // int var = 20;
    // IO.println(var);
    // var v = 123;
    // IO.println(v);
    // int $50 = 50, $ = 60;
    // IO.println($50+$);

    IO.println(65465);
    IO.println(65____4_________65);
    // IO.println(_465465); // Error
    // IO.println(564_); // Error
    // IO.println(09); // Error
    IO.println(077);
    IO.println(0_77);
    IO.println(0_7__7);
    // IO.println(0_7__7__); // Error
    IO.println(0x7abcf);
    IO.println(0X7ABCF);
    // IO.println(0x7abclk);
    IO.println(0x7a_____bc___f);
    // IO.println(0x__7af); // error: illegal underscore
    // IO.println(0_x7abcf); // error: illegal underscore
    // IO.println(0x7abcf__); // Error
    IO.println(0b010101);
    IO.println(0b01__01__01);
    IO.println(0B01__01__01);
    IO.println(0B01__01__01l);
    // IO.println(456454564645654); // Error
    IO.println(456454564645654l);
    IO.println(-456454564645654l);




}

// class var { //'var' is a restricted type name and cannot be used for type declarations

// }