public class countandsay {
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        char ch = prev.charAt(0);
        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == ch) {
                count++;
            } else {
                sb.append(count).append(ch);
                ch = prev.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        String result = countAndSay(n);
        System.out.println(result);
    }
}