public class Divisible1 {
   public static void main(String[] args) {
      double celsius = 71;
      double fahrenheit = (9.0 / 5.0) * celsius + 32;

      if (fahrenheit >= 100.0 && fahrenheit <= 130.0) {
         System.out.println("Temperature is within range: " + fahrenheit + "°F");
      } else {
         System.out.println("Temperature range exceeded: " + fahrenheit + "°F");
      }
   }
}