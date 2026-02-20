package Palindrome;
public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "madam";
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
            }
            boolean ispalindrome;
            if (text.equals(reversed)) {
                ispalindrome = true;
            } else {
                ispalindrome = false;
            }
            System.out.println("input text " + text);
            System.out.println("reversed text " + reversed);
            System.out.println("is it a palindrome?:" + ispalindrome);
        }
    }