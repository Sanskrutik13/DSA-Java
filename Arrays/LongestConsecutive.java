import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {

        int[] arr = {0,3,7,2,5,8,4,6,0,1};

        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int ele : set) {
            int prev = ele - 1;

            if (!set.contains(prev)) {
                int count = 1;
                int next = ele + 1;

                while (set.contains(next)) {
                    count++;
                    next++;
                }

                max = Math.max(max, count);
            }
        }

        System.out.println(max);
    }
}