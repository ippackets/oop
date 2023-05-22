import java.util.Scanner;

public class _13_matrix {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns = scanner.nextInt();

    int[][] matrix = new int[rows][columns];

    System.out.println("Enter the elements of the matrix:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    System.out.println("Original Matrix:");
    displayMatrix(matrix);

    int[][] transpose = getTranspose(matrix);

    System.out.println("Transpose Matrix:");
    displayMatrix(transpose);

    scanner.close();
  }

  public static int[][] getTranspose(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;

    int[][] transpose = new int[columns][rows];

    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        transpose[i][j] = matrix[j][i];
      }
    }

    return transpose;
  }

  public static void displayMatrix(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}

