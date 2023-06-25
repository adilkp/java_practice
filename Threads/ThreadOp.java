package Threads;

class MyThread1 extends Thread {

    public void run() {
        System.out.println("This is my thread body");
    }

}

public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program started...");

        int x = 99+89;
        System.out.println("The sum is "+x);

        Thread t = Thread.currentThread();

        String tname = t.getName();
        System.out.println("Current running thread is "+tname);

        t.setName("MyMain");
        System.out.println("Current running thread is "+t.getName());

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t.getId());
        
        System.out.println("Program ended...");

        MyThread1 thread = new MyThread1();

        thread.start();

    }
    
}
