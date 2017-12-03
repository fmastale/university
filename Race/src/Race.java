public class Race {
    public static void main(String[] args) {
        Counter cnt = new Counter(0);

      new IThread(cnt).start();
      new DThread(cnt).start();

        System.out.println("stan=" + cnt.value());
    }
}
