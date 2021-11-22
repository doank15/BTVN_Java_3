import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static int cur = 0;
    public static void main(String[] args) {
        int n;
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------------------Menu------------------------");
            System.out.println("1: Add book");
            System.out.println("2: Edit book by id");
            System.out.println("3: Delete book by id");
            System.out.println("4: Sort books by id");
            System.out.println("5: Sort books by price");
            System.out.println("6: Show all books");
            System.out.println("7: Exit!!!");
            System.out.println("Enter your choice!");
            n = sc.nextInt();
        } while(n < 1 || n > 7);
        switch (n) {
            case 1:
                System.out.println("Added Book:");
                addBook();
                break;
            default:
                break;
        }
        sc.close();
    }
    public static void addBook() {
        System.out.println("Enter Book!!!");
        Book newOne = new Book();
        newOne.Input();
        books.add(newOne);
    }
    
    
}
