public class stringMethods {
    public static void main(String[] args) {
        System.out.println(alternateStrings("Hi", "There"));
    }

    public static String alternateStrings(String text1, String text2) {
        String finalText = "";
        int loopLength = Math.min(text1.length(), text2.length());
        for (int i = 0; i < loopLength; i++) {
            finalText = finalText + text1.substring(i, i + 1) + text2.substring(i, i + 1);
        }
        finalText = finalText + text1.substring(loopLength) + text2.substring(loopLength);
        return finalText;
    }

    public static boolean abcTest(String text) {
        if (text.contains(".abc") || !text.contains("abc")) {
            return false;
        }
        return true;
    }

}
