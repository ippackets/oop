import java.util.*;

public class _11_Table_Palindrome {

  public static void palindrome(int n){

    int ch = 0;
    int check = n;

    while(n != 0){
      int tmp = n % 10;
      ch = ch * 10 + tmp;
      n /= 10;
    }

    if(check == ch){
      System.out.println("Number, " + check + " is palindrome");
    }else{
      System.out.println("Nope");
    }
  }


  public static void table(int n){

    System.out.println("\nTable : ");

    for(int i=1; i<=10; i++){
      System.out.println(n + " x " + i + " = " + (n * i));
    }

  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int n = sc.nextInt();

    table(n);
    
    System.out.print("\nEnter a number for palindrome : ");
    int pal = sc.nextInt();
    palindrome(pal);


  }
}
