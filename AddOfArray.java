import java.util.Scanner;
public class AddOfArray {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int rows = scanner.nextInt();
    System.out.println("Enter the number of columns:");
    int columns = scanner.nextInt();
    int arr1[][] = new int[rows][columns];
    int arr2[][] = new int[rows][columns];
    int sum[][] = new int[rows][columns];

    System.out.println("Enter the elements of the first array:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            arr1[i][j] = scanner.nextInt();
        }
    }
    System.out.println("Enter the elements of the second array:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            arr2[i][j] = scanner.nextInt();
        }
    }
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            sum[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    System.out.println("Sum of the arrays:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(sum[i][j] + " ");
        }
        System.out.println();
    }

    scanner.close();
}

}
