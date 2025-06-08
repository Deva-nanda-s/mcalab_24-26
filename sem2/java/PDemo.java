class MultiplicationTable implements Runnable {
        @Override
        public void run() {
            System.out.println("Multiplication Table of 5:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 x " + i + " = " + (5 * i));
                try {
                    Thread.sleep(200); 
		   } catch (InterruptedException e) {
                    e.printStackTrace();
                } } } }
class FactorFinder implements Runnable {
        @Override
        public void run() {
            int number = 36;
            System.out.println("\nFactors of " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("F(36) : "+i);
                }
                try {
                    Thread.sleep(300); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } } } }
public class PDemo{
    public static void main(String[] args) {
        MultiplicationTable tableTask = new MultiplicationTable();
        FactorFinder factorTask = new FactorFinder();

        Thread tableThread = new Thread(tableTask);
        Thread factorThread = new Thread(factorTask);

        tableThread.start();
        factorThread.start();

        System.out.println("Main thread continues...");
        try {
            tableThread.join();
            factorThread.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}
