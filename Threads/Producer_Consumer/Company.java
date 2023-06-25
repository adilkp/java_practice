package Threads.Producer_Consumer;

public class Company {

    int n;

    boolean flag=false;

    synchronized public void produce_item(int n) throws InterruptedException {
        if(flag) {
            wait();
        }
        this.n = n;
        System.out.println("Produced item : "+this.n);
        flag = true;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if(!flag) {
            wait();
        }
        System.out.println("Consumed item : "+this.n);
        flag = false;
        notify();
        return this.n;
    }
    
}
