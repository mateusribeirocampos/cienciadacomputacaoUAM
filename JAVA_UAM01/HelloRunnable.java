public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Ola, estou rodando!");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}