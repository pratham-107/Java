public class CylinderVolume {
  public static void main(String[] args) {
    // Given values
    double radius = 5.73;
    double height = 22;  


    double volume = Math.PI * Math.pow(radius, 2) * height;


    System.out.println("The volume of the cylinder is: %.2f cubic cm%n", volume);
  }
}