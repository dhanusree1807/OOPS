import java.util.Scanner;
public class LarNumOf3 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the first element:");
    int n1 = scan.nextInt();

    System.out.println("Enter the second element:");
    int n2 = scan.nextInt();

    System.out.println("Enter the third element:");
    int n3 = scan.nextInt();

    if (n1 > n2 && n1 > n3) {
        System.out.println("The largest is " + n1);
    } else if (n2 > n1 && n2 > n3) {
        System.out.println("The largest is " + n2);
    } else {
        System.out.println("The largest is " + n3);
    }

    scan.close();
}

}
