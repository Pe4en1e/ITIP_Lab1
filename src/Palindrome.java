public class Palindrome {
    public static void main(String[] args) {
        for (String string : args) System.out.println(isPalindrome(string));;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
}
