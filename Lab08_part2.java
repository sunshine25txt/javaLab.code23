class A {
    public static void main(String[] args) {
        IO.println("A.main()");
    }
}
class Lab08_part2 {
    public static void main(String[] args) {
        IO.println("Lab08_part2");
        main();
    }
    // error: method main(String[]) is already defined in class Lab08_part2
    // public static void main(String[] args) {
    //     IO.println("Lab08_part2");
    // }
    public static void main() {
        IO.println("main()");
    }
}
