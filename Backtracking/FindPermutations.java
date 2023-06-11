import java.util.ArrayList;

public class FindPermutations {
    public static void main(String[] args) {
        
        String str = "abc";
        findAllPermutations(str, "");
        
    }

    public static void findAllPermutations(String str, String ans) {
        // base condition 
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        // we will add current character to ans and remove it from the main string
        // as all characters will be finished, we print our permutation and return back to previous stag
        
        for(int i = 0; i<str.length(); i++) {
            char curr = str.charAt(i);
            // we will keep removing previous characters from the string that will be passed to the new recursion call
            String newStr = str.substring(0, i) + str.substring(i+1);
            // here we will keep on adding current string to the answer 
            findAllPermutations(newStr, ans+curr);
        }
    }

}
