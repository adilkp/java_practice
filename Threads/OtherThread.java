package Threads;

public class OtherThread extends Thread {

    public void run() {
        for (int i = 10; i >0 ; i--) {
         System.out.println("Value of other : "+i);
         try {
             Thread.sleep(2000);
             
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
         
         
        }
    }
    
}
