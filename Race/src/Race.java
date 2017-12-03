public class Race {
    public static void main(String[] args) {
        Counter cnt = new Counter(0);

        Thread one = new IThread(cnt);
        Thread two = new DThread(cnt);

        one.start();
        two.start();


        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("stan=" + cnt.value());
    }
}
