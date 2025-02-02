import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int mark;
    static int Count = 0;

    public Student(Scanner sc) { // Constructor now takes a Scanner
        System.out.print("Enter rollNo: ");
        rollno = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter mark: ");
        mark = sc.nextInt();
        Count++;
    }

    public void displayStud() {
        System.out.println("Roll_no: " + rollno + " Name: " + name + "  Mark: " + mark);
    }

    public static void displayCount() {
        System.out.println("No of Student: " + Count);
    }
}

public class StudentDemo {

    public static void sortStud(Student[] s) {  // Corrected method name and takes Student[]
        int n = Student.Count; // Use the static Count
        for (int i = 0; i < n - 1; i++) { // Iterate up to n-1
            for (int j = i + 1; j < n; j++) { // Iterate from i+1 to n
                if (s[i].mark < s[j].mark) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) { // Use String[] args
        Scanner sc = new Scanner(System.in); // Create Scanner once
        Student[] s = new Student[10]; // Array size can be larger

        for (int i = 0; i < 5; i++) {
            s[i] = new Student(sc); // Pass the Scanner to the constructor
        }

        sortStud(s);
        
        for (int i = 0; i < 5; i++) {
            s[i].displayStud();
        }
        sc.close(); // Close the scanner after use
    }
}