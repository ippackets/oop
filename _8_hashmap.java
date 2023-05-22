import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _8_hashmap {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> phoneBook = new HashMap<>();

    System.out.print("Enter the number of entries in the phone book: ");
    int numEntries = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    // Read the phone book entries
    System.out.println("Enter the name and phone number for each entry:");
    for (int i = 0; i < numEntries; i++) {
      System.out.print("Name: ");
      String name = scanner.nextLine();
      System.out.print("Phone Number: ");
      String phoneNumber = scanner.nextLine();
      phoneBook.put(name, phoneNumber);
    }

    // Process the queries
    System.out.println("Enter the name to search for entries (type 'exit' to quit):");
    String query = scanner.nextLine();
    while (!query.equalsIgnoreCase("exit")) {
      if (phoneBook.containsKey(query)) {
        String phoneNumber = phoneBook.get(query);
        System.out.println("Name: " + query + ", Phone Number: " + phoneNumber);
      } else {
        System.out.println("Not found");
      }
      System.out.println("Enter the name to search for entries (type 'exit' to quit):");
      query = scanner.nextLine();
    }

    scanner.close();
  }
}

