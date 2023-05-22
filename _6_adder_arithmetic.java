class Arithmetic {
  public int add(int a, int b) {
    return a + b;
  }
}

class Adder extends Arithmetic {
}

public class _6_adder_arithmetic {
  public static void main(String[] args) {
    Adder adder = new Adder();
    System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

    int num1 = 42;
    int num2 = 13;
    int sum = adder.add(num1, num2);
    System.out.println(num1 + " + " + num2 + " = " + sum);

    int num3 = 20;
    sum = adder.add(num1, num3);
    System.out.println(num1 + " + " + num3 + " = " + sum);
  }
}

