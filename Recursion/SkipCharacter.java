public class SkipCharacter {
    public static void main(String[] args) {

        // given a string, return another string with removing all 'a' from it

        String str = "Aladin Alabama";

        // using recursion for solving this question -
        StringBuilder resultStr1 = new StringBuilder();
        resultStr1 = filterCharacterIn(str, 0, resultStr1);
        System.out.println("String with removed 'a's using recursion is: " + resultStr1);


        // using iterative approach to solve this question

        StringBuilder resultStr = new StringBuilder();
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if((ch != 'a' && ch == 'A') || (ch != 'A' && ch == 'a')) {
                continue;
            } else {
                resultStr.append(str.charAt(i));
            }
        }
        System.out.println("String with removed 'a's is: " + resultStr);

    }

    public static StringBuilder filterCharacterIn(String str, int index, StringBuilder resultStr) {
        if(index == str.length()) {
            return resultStr;
        }
        char ch = str.charAt(index);
        if((ch != 'a' && ch == 'A') || (ch != 'A' && ch == 'a')) {
            return filterCharacterIn(str, index+1, resultStr);
        } else {
            resultStr.append(ch);
            return filterCharacterIn(str, index+1, resultStr);
        }
    }
}
