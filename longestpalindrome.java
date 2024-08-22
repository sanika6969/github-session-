class longestpalindrome {
    String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String LPS = "";
        
        for (int i = 0; i < s.length(); i++) {
            // For odd length palindromes
            int low = i;
            int high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }

            // For even length palindromes
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }
        
        return LPS;
    }

    public static void main(String[] args) {
        longestpalindrome lp = new longestpalindrome();
        String s = "babad";
        System.out.println("Longest Palindromic Substring of " + s + " is: " + lp.longestPalindrome(s));
    }
}
  