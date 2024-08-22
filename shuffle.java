import java.util.Arrays;

public class shuffle {

    static boolean shuffled(String s1, String s2, String res) {

        int n = s1.length();
        int m = s2.length();

        if (n + m != res.length()) {
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        char[] resArray = res.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        Arrays.sort(resArray);

        int i = 0, j = 0, k = 0;

        while (k < res.length()) {
            if (i < n && s1Array[i] == resArray[k]) {
                i++;
            } else if (j < m && s2Array[j] == resArray[k]) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String res = "dabzzf";
        

        System.out.println(s1 + ", " + s2 + ", " + res + " is a shuffle: " + shuffled(s1, s2, res));
    }
}