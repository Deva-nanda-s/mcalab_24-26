import java.util.Scanner;

class PrimeThread implements Runnable {
    int limit;

    PrimeThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Prime numbers from 1 to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }

            try {
                Thread.sleep(100); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nPrime thread finished.\n");
    }
}

class EvenThread implements Runnable {
    int limit;

    EvenThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Even numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            try {
                Thread.sleep(80); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nEven thread finished.\n");
    }
}

class FibonacciThread implements Runnable {
    int count;

    FibonacciThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("First " + count + " Fibonacci numbers:");
        int a = 0, b = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;

            try {
                Thread.sleep(120); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nFibonacci thread finished.\n");
    }
}

public class PEF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit for prime and even numbers: ");
        int limit = sc.nextInt();

        System.out.print("Enter count for Fibonacci series: ");
        int fibCount = sc.nextInt();

        Thread t1 = new Thread(new PrimeThread(limit));
        Thread t2 = new Thread(new EvenThread(limit));
        Thread t3 = new Thread(new FibonacciThread(fibCount));

        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have completed. Program finished.");
        sc.close();
    }
}



import java.util.Scanner;

class FactorialThread implements Runnable {
    int n;
    FactorialThread(int n)
     { 
        this.n = n; 
    }

    public void run() {
        long fact = 1;
        for (int i = 1; i <= n; i++) 
           fact *= i;
        System.out.println("1. Factorial of " + n + ": " + fact);

        try 
        { 
            Thread.sleep(100); 
        } 
        catch (InterruptedException e) 
        {
            e.printStackTace();
        }
    }
}

class FibonacciThread implements Runnable {
    int n;
    FibonacciThread(int n) { this.n = n; }

    public void run() {
        int a = 0, b = 1;
        System.out.print("2. Fibonacci: ");
        for (int i = 1; i <= n; i++)
         {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
        try 
        { 
            Thread.sleep(100); 
        } 
        catch (InterruptedException e) 
        { 
             e.printStackTace();
        }
    }
}

class TableThread implements Runnable {
    int n;
    TableThread(int n) 
    { 
        this.n = n; 
    }

    public void run() {
        System.out.println("3. Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class ReverseThread implements Runnable {
    int n;
    ReverseThread(int n) { this.n = n; }

    public void run() {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("4. Reverse of " + n + ": " + rev);
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class PalindromeThread implements Runnable {
    int n;
    PalindromeThread(int n) { this.n = n; }

    public void run() {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (rev == n)
            System.out.println("5. " + n + " is a Palindrome");
        else
            System.out.println("5. " + n + " is not a Palindrome");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class ArmstrongThread implements Runnable {
    int n;
    ArmstrongThread(int n) { this.n = n; }

    public void run() {
        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == n)
            System.out.println("6. " + n + " is an Armstrong number");
        else
            System.out.println("6. " + n + " is not an Armstrong number");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class PerfectNumberThread implements Runnable {
    int n;
    PerfectNumberThread(int n) { this.n = n; }

    public void run() {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        if (sum == n)
            System.out.println("7. " + n + " is a Perfect number");
        else
            System.out.println("7. " + n + " is not a Perfect number");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class PerfectSquaresThread implements Runnable {
    int n;
    PerfectSquaresThread(int n) { this.n = n; }

    public void run() {
        System.out.print("8. Perfect Squares up to " + n + ": ");
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class SumOfDigitsThread implements Runnable {
    int n;
    SumOfDigitsThread(int n) { this.n = n; }

    public void run() {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("9. Sum of digits of " + n + ": " + sum);
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class EvenThread implements Runnable {
    int n;
    EvenThread(int n) { this.n = n; }

    public void run() {
        System.out.print("10. Even numbers up to " + n + ": ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

class OddThread implements Runnable {
    int n;
    OddThread(int n) { this.n = n; }

    public void run() {
        System.out.print("11. Odd numbers up to " + n + ": ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}

public class MultiThreadBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Thread t1 = new Thread(new FactorialThread(n));
        Thread t2 = new Thread(new FibonacciThread(n));
        Thread t3 = new Thread(new TableThread(n));
        Thread t4 = new Thread(new ReverseThread(n));
        Thread t5 = new Thread(new PalindromeThread(n));
        Thread t6 = new Thread(new ArmstrongThread(n));
        Thread t7 = new Thread(new PerfectNumberThread(n));
        Thread t8 = new Thread(new PerfectSquaresThread(n));
        Thread t9 = new Thread(new SumOfDigitsThread(n));
        Thread t10 = new Thread(new EvenThread(n));
        Thread t11 = new Thread(new OddThread(n));

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); t6.start(); 
        t7.start(); t8.start(); t9.start(); t10.start(); t11.start();

        // Wait for all threads to finish
        try {
            t1.join(); t2.join(); t3.join(); t4.join(); t5.join();
            t6.join(); t7.join(); t8.join(); t9.join(); t10.join(); t11.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("\nAll tasks completed.");
        sc.close();
    }
}
