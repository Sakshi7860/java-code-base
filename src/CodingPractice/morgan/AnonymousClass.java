package CodingPractice.morgan;

public class AnonymousClass {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable Thread");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
