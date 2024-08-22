import java.util.Arrays;

public class permutations {
        public static void swap(char[] array, int i, int j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void permute(char[] str, int l, int r) {
            if (l == r) {
                System.out.println(Arrays.toString(str));
            } else {
                for (int i = l; i <= r; i++) {
                    swap(str, l, i);  /// fix a keep a with a return abc 
                    permute(str, l + 1, r); // fix a swap b and c 
                    swap(str, l, i); // fix ab and c 
                }
            }
        }

        public static void main(String[] args) {
            String str = "ABA";   // ABA AAB 
            char[] charArray = str.toCharArray();
            permute(charArray, 0, charArray.length - 1);
        }
    }



