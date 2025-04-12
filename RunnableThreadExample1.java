class MyRunnable implements Runnable{
    private String threadName;
    public MyRunnable(String threadName){
        this.threadName = threadName;
    }
    public void run(){
        try{
            System.out.println("Thread"+threadName+"Starting...");
            Thread.sleep(500);
            System.out.println("Thread"+threadName+"Running..");
        }catch(InterruptedException e){
            System.out.println("Thread"+threadName+"intrrupted");
        }
        System.out.println("Thread"+threadName+"exiting..");
    }
}
public class RunnableThreadExample1 {
    public static void main(String[] args){
    System.out.println("Main thread is starting");
    Thread thread1 = new Thread(new MyRunnable("Thread 1"));
    Thread thread2 = new Thread(new MyRunnable("Thread 2"));
    Thread thread3 = new Thread(new MyRunnable("Thread 3"));
    
    thread1.start();
    thread2.start(); 
    thread3.start();
    System.out.println("Main thread is exiting...");
    }
}