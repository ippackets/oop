import java.util.Scanner;

public class _3reverse_and_palindrome {

  public static String revstring(String s) {
    char[] arr = s.toCharArray();
    int length = s.length();
    char[] ans = new char[length];

    for (char c : arr) {
      ans[--length] = c;
    }

    String revans = new String(ans);

    return revans;
  }

  public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = sc.nextLine();

    String revans = revstring(s);
    System.out.println("Reversed string: " + revans);

    boolean palindromeCheck = isPalindrome(s);
    if (palindromeCheck) {
      System.out.println("The string \"" + s + "\" is a palindrome.");
    } else {
      System.out.println("The string \"" + s + "\" is not a palindrome.");
    }
  }
}

