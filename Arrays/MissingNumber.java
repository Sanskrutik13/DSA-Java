import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        long n = arr.length + 1;

        long total = n * (n + 1) / 2;

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        long ans = total - sum;

        System.out.println("Missing Number: " + ans);

        sc.close();
    }
}