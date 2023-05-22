import java.util.ArrayList;
import java.util.List;

public class _1remove_duplicates_from_array {
  
    public static String[] removeDuplicatesString(String[] arr) {
        List<String> uniqueArr = new ArrayList<>();
        for (String element : arr) {
            if (!uniqueArr.contains(element)) {
                uniqueArr.add(element);
            }
        }
        return uniqueArr.toArray(new String[uniqueArr.size()]);
    }

    public static int[] removeDuplicatesInt(int[] arr) {
        List<Integer> uniqueArr = new ArrayList<>();
        for (int element : arr) {
            if (!uniqueArr.contains(element)) {
                uniqueArr.add(element);
            }
        }
        int[] result = new int[uniqueArr.size()];
        for (int i = 0; i < uniqueArr.size(); i++) {
            result[i] = uniqueArr.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage for string array
        String[] stringArray = {"apple", "banana", "apple", "orange", "banana"};
        String[] stringResult = removeDuplicatesString(stringArray);
        for (String element : stringResult) {
            System.out.println(element);
        }
        // Output: apple, banana, orange

        // Example usage for integer array
        int[] intArray = {1, 2, 1, 3, 2};
        int[] intResult = removeDuplicatesInt(intArray);
        for (int element : intResult) {
            System.out.println(element);
        }
        // Output: 1, 2, 3
    }
}

