public class Counter {
    private int val;

    public Counter(int n) {
        val = n;
    }

    public void inc() {
        val++;
        System.out.println("inc val: " + val);
    }

    public void dec() {
        val--;
        System.out.println("dec val: " + val);
    }

    public int value() {
        return val;
    }
}
