public class DThread extends Thread {
    private Counter counter;
    private int howMany = 0;

    public DThread(Counter cnt) {
        this.counter = cnt;
    }

    public void run() {
        while (howMany < 1000) {
            counter.dec();
            howMany++;
        }
    }
}

