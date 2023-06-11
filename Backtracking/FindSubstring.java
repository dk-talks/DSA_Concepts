public class FindSubstring {
    public static void main(String[] args) {

        String str = "eidboaoo";
        
        
        

    }
    public static void findSub(String str, String ans, int i) {
        // base condition
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        /*
        Here we have two choices, either the current character will be inserted into the result string OR not
         */
        // CHOOSE YES
        findSub(str, ans+str.charAt(i), i+1);
        // CHOOSE NO (this function call below is the backtacking function)
        findSub(str, ans, i+1);
        
        // here when backtracking, string is automatically reduced to previous call's value
        // lets try with string builder if i can do it or not
        
        /*
        findSub(str, ans.append(str.charAt(i)), i+1);
        findSub(str, ans.delete(ans.length()-1, ans.length()), i+1); // its working
        */
    }
}
