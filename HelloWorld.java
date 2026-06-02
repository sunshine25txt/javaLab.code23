// class HelloWorld {
//     public static void main(String[] args) {        
//         // System.out.println("Hello World!");
//         // System.out.println(args.length);
//         System.out.println("Welcome "+args[0]);
//     }    
// }

import javax.swing.JOptionPane;

void main() {
    // String name = IO.readln("Enter a name:");
    // IO.println("Welcome to "+name);
    // IO.print("Hello World!");
    // String name = JOptionPane.showInputDialog(
    //     "Enter a name");
    // JOptionPane.showMessageDialog(null, 
    //     "Welcome "+name, "Java GUI", 
    //     1);
    // int n = Integer.parseInt(IO.readln());
    // System.out.printf("Number: %d",n*20);
    float n = Float.parseFloat(IO.readln());
    System.out.printf("Number: %f",n/123);
}
