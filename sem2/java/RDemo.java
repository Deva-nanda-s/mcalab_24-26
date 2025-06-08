class MyRunnable implements Runnable {
public void run() {
            System.out.println("Thread implementing Runnable interface is running.");
            for (int i = 0; i < 5; i++) {
                System.out.println("MyRunnable: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } } } }
public class RDemo{
public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable); // Pass Runnable to Thread constructor
        thread2.start(); // Starts the thread.
        System.out.println("Main thread continues...");
        for (int i = 0; i < 3; i++){
            System.out.println("main thread: " + i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            } } } } 
