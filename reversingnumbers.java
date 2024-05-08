import java.util.Scanner;
public class reversingnumbers {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = scan.nextInt();
    int num[] = new int[n];

    System.out.println("Enter the elements in the array:");
    for (int i = 0; i < n; i++) {
        num[i] = scan.nextInt();
    }

    System.out.println("The reversed numbers in the array are:");
    for (int i = n-1; i>=0; i--) {

        System.out.print(num[i] + " ");
    }
    scan.close();
}

}


