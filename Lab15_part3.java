class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}
class CounterThread extends Thread {
    Counter counter;
    public CounterThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for(int i = 0; i < 1000; i++) {
            // synchronized(counter) {
                counter.increment();
            // }
        }
    }
    static CounterThread createAndRunCounterThread(Counter c) {
        CounterThread ct = new CounterThread(c); ct.start();
        return ct;
    }
}
public class Lab15_part3 {
    public static void main(String[] args) throws InterruptedException {
        Counter demo = new Counter();
        // Thread t1 = new CounterThread(demo);
        // Thread t2 = new CounterThread(demo);
        // t1.start();  t2.start();
        CounterThread t1 = CounterThread.createAndRunCounterThread(demo);
        CounterThread t2 = CounterThread.createAndRunCounterThread(demo);
        t1.join();   t2.join();
        IO.println("Final count: " + demo.count);
    }
}
