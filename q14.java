public class q14 {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int n = strs.length;
        int min = 205;
        for (int i = 0; i < n; i++) {
            int m = strs[i].length();
            if (m < min) {
                min = m;
            }

        }

        int count = 0;
        int flag = 1;
        for (int t = 0; t < min && flag == 1; t++) {
            char ch = strs[0].charAt(t);
            // System.out.println(ch);
            count = 0;
            for (int k = 0; k < n; k++) {

                if (strs[k].charAt(t) == ch) {
                    count++;
                }

                if (count == n) {
                    ans = ans + strs[k].charAt(t);
                    // System.out.println(count2);
                }

                if (strs[k].charAt(t) != ch) {
                    flag = 0;
                    break;
                }

            }

        }
        return ans;
    }
}
