import java.util.Arrays;
import java.util.*;

public class q27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        int k = in.nextInt();

        System.out.println(removeElement(num, k));

        in.close();
    }

    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);

        int n = nums.length;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            }

        }
        return pos;

    }
}
