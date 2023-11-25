import java.util.*;

public class Color {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter resistor colors (hyphen separated): ");
        String input = scanner.nextLine();
        
        String[] colors = input.split("-");
        int value = decodeResistance(colors);
        
        System.out.println("Resistance value: " + value);
    }
    
    public static int decodeResistance(String[] colors) {
        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);
        
        int value = 0;
        int i = 0;
        while (i < colors.length && i < 2) {
            value = value * 10 + colorMap.getOrDefault(colors[i].toLowerCase(), 0);
            i++;
        }
        
        return value;
    }
}