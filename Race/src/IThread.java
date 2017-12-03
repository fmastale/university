public class IThread extends Thread {
    private Counter counter;
    private int howMany = 0;

    public IThread(Counter cnt) {
        this.counter = cnt;
    }

    public void run() {
        while (howMany < 1000) {
            counter.inc();
            howMany++;
        }
    }
}