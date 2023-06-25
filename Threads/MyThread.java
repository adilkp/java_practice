package Threads;

public class MyThread implements Runnable{

    @Override
    public void run() {
       for (int i = 0; i < 10; i++) {
        System.out.println("Value of i : "+i);
        try {
            Thread.sleep(1000);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
       }
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        // MyThread t2 = new MyThread();
        // MyThread t3 = new MyThread();
        Thread thread1 = new Thread(t1);
        // Thread thread2 = new Thread(t1);
        // Thread thread3 = new Thread(t1);

        OtherThread otherThread = new OtherThread();

        thread1.start();
        // thread2.start();
        // thread3.start();
        otherThread.start();
        
    }

    
}
