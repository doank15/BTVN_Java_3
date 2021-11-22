import java.util.Scanner;

public class Book extends Document{
    private int numberOfPage;
    private String author;
    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.println("Enter name document: ");
        name = sc.nextLine();
        System.out.println("Enter publisher");
        publisher = sc.nextLine();
        System.out.println("Enter price: ");
        price = sc.nextFloat();
        System.out.println("Enter number of page: ");
        numberOfPage = sc.nextInt();
        System.out.println("Enter author: ");
        author = sc.nextLine();
    }
    public void Output() {
        System.out.format("%10s %10s %10s %10s %10s %10s", id, name,publisher,price, numberOfPage,author);
    }
}
