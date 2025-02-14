import java.util.Scanner;

class Book{
    String title;
    String author;
    int price;
    static int count=0;

    public Book(Scanner sc){
        System.out.println("Enter title of book");
        title=sc.nextLine();

        System.out.println("Enter author of book");
        author=sc.nextLine();

        System.out.println("Enter price of book");
        price=sc.nextInt();
        sc.nextLine(); 
        count++;   
    }

    public void displayBook(){
        System.out.println("Title:"+title+  "Author:"+author+  "Price:"  +price);
    }
}
    

public class BookDemo{
        public static void sortBook(Book[] b){
            int n=Book.count;
            for (int i = 0; i < n - 1; i++) {
                 for (int j = i + 1; j < n; j++) { 
                    if ((b[i].author).compareTo(b[j].author)>0) {
                         Book temp = b[i];
                         b[i] = b[j];
                         b[j] = temp;
                }
            }
        }
            
        }

        
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in); // Create Scanner once
             Book[] b = new Book[10];

             for(int i=0;i<3;i++){
                b[i]=new Book(sc);
             }
             
             sortBook(b);

             for(int i=0;i<3;i++){
                b[i].displayBook();
             }

             sc.close();

        }
}
