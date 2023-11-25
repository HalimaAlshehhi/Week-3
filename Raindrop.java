public class Raindrop  {
    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Pling");
        }
        if (number % 5 == 0) {
            result.append("Plang");
        }
        if (number % 7 == 0) {
            result.append("Plong");
        }

        // If the result string is empty, append the digits of the number
        if (result.length() == 0) {
            result.append(number);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        int num1 = 28;
        int num2 = 30;
        int num3 = 34;

        System.out.println(num1 + " converts to: " + convert(num1));
        System.out.println(num2 + " converts to: " + convert(num2));
        System.out.println(num3 + " converts to: " + convert(num3));
    }
}
