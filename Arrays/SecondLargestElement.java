  import java.util.Scanner;
public class SecondLargestElement {
  


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest1=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>largest1){
                largest1=arr[i];
            }
        }

        int largest2=Integer.MIN_VALUE;

         for(int i=0; i<n; i++){
            if(arr[i]>largest2 && arr[i]!=largest1){
                largest2=arr[i];
            }
        }


        System.out.println("largest Element is"+largest2);
    }
}

