import java.util.*;

// Publisher class
class Publisher {
    String pubname;

    public Publisher(String pubname) {
        this.pubname = pubname;
    }
}

// Book class
class Book extends Publisher {
    String title;
    int price;

    public Book(String pubname, String title, int price) {
        super(pubname);
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Publisher Name: " + pubname);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

// Department class
class Department {
    String deptname;

    public Department(String deptname) {
        this.deptname = deptname;
    }
}

// Employee class
class Employee extends Department {
    String empname;
    int empid;

    public Employee(String empname, int empid, String deptname) {
        super(deptname);
        this.empname = empname;
        this.empid = empid;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee ID: " + empid);
        System.out.println("Department: " + deptname);
    }
}

// Book Thread
class BookThread extends Thread {
    Book book;

    public BookThread(Book book) {
        this.book = book;
    }

    public void run() {
        book.display();
    }
}

// Employee Thread
class EmployeeThread extends Thread {
    Employee emp;

    public EmployeeThread(Employee emp) {
        this.emp = emp;
    }

    public void run() {
        emp.display();
    }
}

// Main class
public class exam5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many entries? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Entry " + i + " ---");

            System.out.print("Book Title: ");
            String title = sc.nextLine();

            System.out.print("Book Price: ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.print("Publisher Name: ");
            String pubname = sc.nextLine();

            System.out.print("Department Name: ");
            String deptname = sc.nextLine();

            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            String empname = sc.nextLine();

            // Create objects
            Book b = new Book(pubname, title, price);
            Employee e = new Employee(empname, empid, deptname);

            // Threads
            BookThread t1 = new BookThread(b);
            EmployeeThread t2 = new EmployeeThread(e);

            // Start book thread and wait
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException ex) {
                System.out.println("Book thread interrupted");
            }

            // Start employee thread and wait
            t2.start();
            try {
                t2.join();
            } catch (InterruptedException ex) {
                System.out.println("Employee thread interrupted");
            }
        }

        sc.close();
    }
}
