import java.util.Scanner;

public class uc16 {

    // Method to perform Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array
    public static void display(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();

        int capacities[] = new int[n];

        // Input capacities
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        System.out.print("Before Sorting: ");
        display(capacities);

        // Call Bubble Sort
        bubbleSort(capacities);

        System.out.print("After Sorting: ");
        display(capacities);

        sc.close();
    }
}