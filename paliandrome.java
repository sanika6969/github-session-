
public class paliandrome {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "vaishii";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(str + " is a palindrome ?  " + isPalindrome);
    }
}