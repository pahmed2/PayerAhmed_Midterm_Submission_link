package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String word1 = "Madam";
        String word2 = "PeopleNtech";
        checkPalindrome(word1); //is palindrome
        checkPalindrome(word2); //not palindrome
        checkPalindrome("DAD"); //is palindrome
        checkPalindrome("CIVIC"); // is palindrome
    }

    public static void checkPalindrome(String word){
        String actual = word.toLowerCase();
        String reverse = "";

        for(int i= actual.length()-1; i >= 0; i--){
            reverse = reverse + actual.charAt(i);
        }
        if(actual.equals(reverse)){
            System.out.println("Yes palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
