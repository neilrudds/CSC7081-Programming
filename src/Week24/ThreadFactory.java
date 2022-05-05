package Week24;

public class ThreadFactory {

    public static void main(String[] args) {
        
        System.out.println("In main start.");

        // Our runnable thread implementation
        MyThread myThread = new MyThread();

        // Delegation
        Thread thread = new Thread(myThread);
        thread.start();
        
        System.out.println("In main end.");
    }
    
}