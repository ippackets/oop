import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _13_word_count_in_file {

  public static void main(String[] args) {
    try {
      File file = new File("./_13_matrix.java"); // Replace "sample.txt" with your text file path

      Scanner scanner = new Scanner(file);
      int wordCount = 0;

      while (scanner.hasNext()) {
        String word = scanner.next();
        wordCount++;
      }

      scanner.close();

      System.out.println("Number of words in the file: " + wordCount);
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
  }
}

