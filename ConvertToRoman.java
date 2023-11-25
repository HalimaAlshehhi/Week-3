import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertToRoman {

    private final static LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String toRoman(int number) {
        StringBuilder roman = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int value = entry.getKey();
            String numeral = entry.getValue();
            while (number >= value) {
                roman.append(numeral);
                number -= value;
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        int number = 1990;
        String roman = toRoman(number);
        System.out.println("In Roman numerals, " + number + " is " + roman);
    }
}