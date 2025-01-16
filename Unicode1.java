public class Unicode1
{
  public static void main(String[] args)
  {
     int x = 2;
     int y = 4;
     int z = x++ + ++y;
     int a = x+y+z+ --x - z--;
 
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(a);

    // System.out.println(x+""+y+""+z);   

  }
}