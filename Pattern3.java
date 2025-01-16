public class Pattern3 {

 public static void main(String[] args) {
    int n = 8;
    for (int i =0; i<n; i++){ 
         int number = 1;
         System.out.printf("%"+(n+1)*2+"s","");
         for (int j = 0; j<=i; j++){
              System.out.printlf("%4d", number);
              number = number *(i-j)/(j+i);
         }
          System.out.println();
  }
 }
}
