import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordbreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return wordBreakHelper(s, wordSet, 0);
    }

    private boolean wordBreakHelper(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String subStr = s.substring(start, end);
            if (wordDict.contains(subStr) && wordBreakHelper(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "catsanddogs";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("dogs");
        wordDict.add("cat");

        wordbreak wordBreak = new wordbreak();
        boolean canBeSegmented = wordBreak.wordBreak(s, wordDict);
        System.out.println(canBeSegmented); // Output: true
    }
}