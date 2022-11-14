import java.util.*;
public class q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int[] num = new int[n];

        for(int i =0;i<n;i++)
        {
            num[i]=in.nextInt();
        }

        System.out.println(removeDuplicates(num));

        in.close();
    }

    public static  int removeDuplicates(int[] nums) {
        int n =nums.length;
        int oldnum=nums[0];
        int pos=1;
        for(int j=0;j<n;j++){
            if(nums[j]!=oldnum){
                nums[pos]=nums[j];
                oldnum=nums[j];
                pos++;
            }
        }
        
        return pos;
    }
}
