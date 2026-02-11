import java.util.Scanner;
public class BinarySearchexample {
    public static void main(String[] args) {
        int[] arr = {12, 15, 20, 29, 34, 39, 46, 50, 85};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key value to search: ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int comparisons = 0;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;
            if (arr[mid] == key) {
                System.out.println("Key found at index: " + mid);
                System.out.println("Position: " + (mid + 1));
                System.out.println("Number of comparisons: " + comparisons);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Key not found");
            System.out.println("Number of comparisons: " + comparisons);
        }

        sc.close();
    }
}
