import java.util.ArrayList;
import java.util.Iterator;

public class _15_Iterator_Advance_for_loop {

  public static void main(String[] args) {
    // Create an ArrayList and insert values
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(20);
    arrayList.add(30);
    arrayList.add(40);

    System.out.println("Iterator Loop:");
    // Iterate using iterator
    Iterator<Integer> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      int element = iterator.next();
      System.out.println(element);
    }

    System.out.println("\nAdvanced For Loop:");
    // Iterate using advanced for-loop
    for (int element : arrayList) {
      System.out.println(element);
    }

    System.out.println("\nFor Loop:");
    // Iterate using for-loop
    for (int i = 0; i < arrayList.size(); i++) {
      int element = arrayList.get(i);
      System.out.println(element);
    }
  }
}

