class MyCalculator {
  public long power(int n, int p) throws Exception {
    if (n < 0 || p < 0) {
      throw new Exception("n or p should not be negative");
    } else if (n == 0 && p == 0) {
      throw new Exception("n and p should not be zero");
    } else if (n == 0) {
      return 0; // Any number raised to the power of 0 is 1, but we handle this as per the requirements
    } else {
      return (long) Math.pow(n, p);
    }
  }
}

public class _7_throws_exception {  
  public static void main(String[] args) {
    MyCalculator calculator = new MyCalculator();

    try {
      long result1 = calculator.power(2, 3);
      System.out.println("Result 1: " + result1);

      long result2 = calculator.power(0, 3); // n is 0, returns 0
      System.out.println("Result 2: " + result2);

      long result3 = calculator.power(2, -5); // Any number raised to the power of 0 is 1, but we handle this as per the requirements
      System.out.println("Result 3: " + result3);

      long result4 = calculator.power(0, 0); // Throws exception
      System.out.println("Result 4: " + result4);
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }
}

