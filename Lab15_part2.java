class A implements Runnable { public void run() {
    IO.println("ChildThrd");
    Thread t = Thread.currentThread();
    IO.println(t);
    IO.println(t.threadId());
    IO.println(t.getName());
    IO.println(t.getPriority());
    IO.println("ChildThrd Ended");
}}
class B extends Thread {
    public void run() {
    IO.println("ChildThrdExt");
    Thread t = Thread.currentThread();
    IO.println(t);
    IO.println(t.threadId());
    IO.println(t.getName());
    IO.println(t.getPriority());
    IO.println("ChildThrdExt Ended");
}
}
public class Lab15_part2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        IO.println(t);
        IO.println(t.threadId());
        IO.println(t.getName());
        IO.println(t.getPriority());
        // Thread ct = new Thread(new A()); ct.start();
        // B ct = new B(); ct.start();
        Thread ct = new Thread() {
            public void run() {
            IO.println("ChildThrdAnno");
            Thread t = Thread.currentThread();
            IO.println(t);
            IO.println(t.threadId());
            IO.println(t.getName());
            IO.println(t.getPriority());
            IO.println("ChildThrdAnno Ended");
        }
        }; ct.start();
        ct.join();
        IO.println("MainThrd Ended");
        // Thread.sleep(1000);
        // t.setName("A");
        // t.setPriority(10);
        // IO.println(t.getName());
        // IO.println(t.getPriority());

    }
}
