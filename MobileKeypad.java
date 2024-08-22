public class MobileKeypad {
    public static String printSequence(String input) {
        String[] keypad = {
            "2", "22", "222", "3", "33", "333", "4", "44", "444", 
            "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", 
            "8", "88", "888", "9", "99", "999", "9999"
        };

        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toUpperCase(ch) - 'A'; // Calculate index based on ASCII value
                output.append(keypad[index]);
            } else if (Character.isWhitespace(ch)) {
                output.append("0"); // Represent space with '0'
            } else {
                // Ignore other characters (e.g., punctuation)
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String input = "HELLO WORLD!";
        String output = printSequence(input);
        System.out.println(output);
    }
}
