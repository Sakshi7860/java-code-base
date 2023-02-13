package Threading.InterruptExample;

class Print
{
    public void show() throws InterruptedException {
        for(int i=0;i<1000;i++) {
            //Thread.sleep(1000);
            System.out.println(i);
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        Print print=new Print();
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    print.show();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                th1.interrupt();
            }
        });
        th1.start();
        th2.start();

    }
}
