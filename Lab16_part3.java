class A<T> {
    // static T s; // error: non-static type variable T cannot be referenced from a static context
    // static T m(){return t;} // Error
    
    T t; A(T t) {this.t = t;} 
    T m1() {return t;}
    void m2() {IO.println("T:"+t.getClass().getName());}
    void m3() {
        T[] ta;
        // ta = new T[10]; // error: generic array creation
    }
}
class B{}

public class Lab16_part3 {
    public static void main(String[] args) {
        A<Integer> ai = new A<Integer>(10);
        IO.println(ai.m1()); ai.m2();
        A<String> as = new A<>("AA");
        IO.println(as.m1()); as.m2();
        // A<> aa = new A<Integer>(100); //error: illegal start of type
        // A<Integer>[] aa = new A<Integer>[10]; //Error
        A[] aa = new A[10];
        A<?>[] aa1 = new A[10];
        A<B> ab = new A<B>(new B());
        IO.println(ab.m1()); ab.m2();
    }
}
