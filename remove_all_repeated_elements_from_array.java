import java.util.*;

public class remove_all_repeated_elements_from_array {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int num = sc.nextInt();

    String[] arr = new String[num];

    for(int i=0; i<num; i++){
      System.out.println("Enter " + i + "th element : ");
      arr[i] = sc.nextLine();
    }

    for(int i=0; i<num; i++){
      System.out.println(arr[i]);
    }
  }
}
