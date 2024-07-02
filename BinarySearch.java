import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length-1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < a[mid]) {
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number you want to enter: ");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Enter " + (i+1) + " number element: ");
            int ele = inp.nextInt();
            arr[i] = ele;
        }

        Arrays.sort(arr);

        Scanner a = new Scanner(System.in);
        System.out.print("Enter element you want to search: ");
        int src = a.nextInt();

        if (binarySearch(arr, src) == -1) {
            System.out.println("Element is not found.");
        }
        else {
            System.out.println("Element found at the index of " + binarySearch(arr, src) + ".");
        }
    }
}