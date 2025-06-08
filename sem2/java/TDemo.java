class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread extending Thread class is running.");
            for (int i = 0; i < 5; i++) {
                System.out.println("MyThread: " + i);
                try {
                    Thread.sleep(500); 
		   } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                } } } } 
public class TDemo {
        public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start(); // Starts the thread
        System.out.println("Main thread continues...");
        for (int i = 0; i < 3; i++){
            System.out.println("main thread: " + i);
            try{
                Thread.sleep(500);
            } 
            catch (InterruptedException e){
                e.printStackTrace();
            } } } }
