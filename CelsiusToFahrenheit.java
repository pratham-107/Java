public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        if (fahrenheit >= 100 && fahrenheit <= 130) {
            System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
        } else {
            System.out.println("Temperature is out of range (100-130°F)");
        }
    }
}