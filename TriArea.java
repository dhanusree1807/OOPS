import java.util.Scanner;
public class TriArea {public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter the base of triangle: ");
    int base = scan.nextInt();
    System.out.print("Enter the height of triangle: ");
    int height = scan.nextInt();
    double area = 0.5 * base * height;
    System.out.println("The area of the triangle is: " + area);
    scan.close();
}

}
