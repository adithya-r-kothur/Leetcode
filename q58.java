import java.util.*;
public class q58 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s =in.nextLine();
        
        int n =s.length();
        int count=0,flag=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(flag==1){
                    
                    break;
                }
                count=0;
                
            }
            else{
                flag=1;
                count++;
            }
        }
        System.out.println(count);
        in.close();
}
}
