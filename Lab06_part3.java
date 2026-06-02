void main() {
    int i = 5;
    // switch (i) {
    //     case 2:
    //         IO.println("case 2");
    //         break;
    //     case 5:
    //         IO.println("case 5");
    //         // break;
    //     case 7: IO.println("case 7"); //break;    
    //     default:
    //         IO.println("default case");
    //         break;
    // }
    // int a = 0;
    // switch (i+5) {
    //     // case a+10: //error: constant expression required
    //     case 5+5:
    //         IO.println("case 10");
    //         break;
    // }
    // byte b = 10;
    // switch (b) {
    //     case 10:
    //         IO.println("case 10");
    //     case 128: // error: incompatible types: possible lossy conversion from int to byte
    //         IO.println("case 10");
    //     case 11L: //error: incompatible types: possible lossy conversion from long to byte
    //         IO.println("case 10");
    // }
    // char c = 'A';
    // switch (c) {
    //     case 'a':            
    //         break;    
    //     case 'A':
    //         IO.println(c);
    //         break;
    // }
    // float f = 2.5f;
    // switch (f) { // ERROR
    //     case 2.56f:  
    //         IO.println(2.56);          
    //         break;
    
    //     default:
    //         IO.println("default");
    //         break;
    // }
    // long l = 12L;
    // switch(l) { // ERROR
    //     case 12L:
    //         IO.println();
    // }
    String s = "AB";
    switch(s) {
        case "AC":
            IO.println("AC");
        case "AB":
            IO.println("AB");
    }
}