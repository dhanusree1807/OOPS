import java.util.Scanner;
public class findeven {    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = scan.nextInt();
    int array[] = new int[n];

    System.out.println("Enter the elements in the array:");
    for (int i = 0; i < n; i++) {
        array[i] = scan.nextInt();
    }

    System.out.println("The even numbers in the array are:");
    for (int i = 0; i < n; i++) {
        if (array[i] % 2 == 0) {
            System.out.print(array[i] + " ");
        }
    }
    scan.close();
}
}


