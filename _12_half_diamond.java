import java.util.Scanner;

public class _12_half_diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows (half of the diamond): ");
        int rows = scanner.nextInt();
        
        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}





/* full diamond 
public class _12_half_diamond {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input number of rows (half of the diamond): ");
    int rows = scanner.nextInt();

    // Upper half of the diamond
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Lower half of the diamond
    for (int i = rows - 1; i >= 1; i--) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    scanner.close();
  }
}
*/
