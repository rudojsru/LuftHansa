public class TestClass implements Runnable {
    volatile int x;

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.x = 10;
        new Thread(tc).start();
        System.out.println(tc.x);
    }

    public void run() {
        x = 5;
    }
}

