 import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("\nPair found");
                    System.out.println("Index 1: " + i + " Value: " + arr[i]);
                    System.out.println("Index 2: " + j + " Value: " + arr[j]);
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);

                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        scanner.close();
    }
}

