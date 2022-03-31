package Week24;

import java.lang.Runnable;

public class MyThread implements Runnable {

    /**
     * The new thread...
     */
    @Override
    public void run() {
        System.out.println("My Thread is alive!");
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Alive and about to end MyThread");
    }
    
}
