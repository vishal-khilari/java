class MyThread extends Thread { 
    public MyThread(String name) {
    super(name);  
    start();
    }
    public void run() {
        System.out.println("Child Thread is executing"); 
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i); 
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) { 
                System.out.println("Child Thread interrupted");
            }
        }
        System.out.println("Child Thread is exiting");
    }
}

public class ThreadExample {
    public static void main(String[] args) { 
        System.out.println("Main Thread is starting...");
        MyThread childThread = new MyThread("Child Thread"); 
        for (int i = 1; i <= 5; i++) {
        System.out.println("Main Thread: " + i); 
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) { 
            System.out.println("Main Thread interrupted");
        }
        }
        System.out.println("Main Thread is exiting...");
    }
}