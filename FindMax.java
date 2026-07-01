import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("\nMaximum value: " + max);
        System.out.println("Index: " + index);

        scanner.close();
    }
}