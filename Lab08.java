class Lab08 {
    {i = 20; // Forward Reference
        // IO.println("BL00|"+i); //error: illegal forward reference
        // j=10; //error: cannot find symbol
    }   
    // A: {IO.println("BL01");} //error: <identifier> expected
    int i;
    // i = 10; // error: <identifier> expected
    // i++;// error: <identifier> expected
    // IO.println("Body");  // error: <identifier> expected
    // m(); // error: invalid method declaration; return type required
    // {i = 20;}
    {IO.println("BL01|"+i);} // Normal Initiallizer Block Executes on Object Creation
    String s = "AB";
    // s = "DEF"; // error: <identifier> expected
    {IO.println("BL02");
    s += "123"; 
    A:{IO.println("BL02:SBL01");}
    m();
    } 
    Lab08() {
        IO.println("Const.");
    }
    void m() {IO.println("m()");}    
    public static void main(String[] args) {
        IO.println("Main Starts");
        // Lab08 a; new Lab08();
        // new Lab08();
        Lab08 a = new Lab08();
        IO.println(a.i);
    }
    {IO.println("BL03"); i++;}
}
