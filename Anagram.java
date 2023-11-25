import java.util.Arrays;

public class Anagram {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        } else {
            // Convert strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare sorted arrays
            return Arrays.equals(charArray1, charArray2);
        }
    }

    public static void main(String[] args) {
        String target = "stone";
        String[] candidates = {"stone", "tones", "banana", "tons", "notes", "Seton"};

        for (String candidate : candidates) {
            if (!candidate.equalsIgnoreCase(target) && areAnagrams(target, candidate)) {
                System.out.println(candidate);
            }
        }
    }
}