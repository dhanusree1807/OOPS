import java.util.Scanner;
public class largestnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scan.nextInt();
        int array[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int largest = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);

        scan.close();

    }
}
