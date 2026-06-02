// enum A { B, C, D}
enum A { B(4), C(2), D(5), E(9);
    int i;
    A(int j){IO.println("enumA"); i = j;}
    int m(int j) {return i*j;}

}
public class Lab15_part4 {
    public static void main(String[] args) {
        A a = A.B; //a = new A(); //a = 10;
        IO.println(a);
        for(A a2:A.values()) IO.println(a2+":"+a2.ordinal()+":"+a2.i+":"+a2.m(5));
    }
}
