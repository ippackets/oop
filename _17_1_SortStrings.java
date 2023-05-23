import java.util.*;

public class _17_1_SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] strarray = new String[10];

        System.out.println("Enter the 10 strings: ");
        for (int i = 0; i < 10; i++) {
            strarray[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(strarray));
        
        //builtin method
        // Arrays.sort(strarray);

        //manual method
        for (int i = 0; i < strarray.length; i++) {
            for (int j = 0; j < strarray.length-i-1; j++) {
                if (strarray[j].compareTo(strarray[j+1]) > 0) {
                    String temp = strarray[j];
                    strarray[j] = strarray[j+1];
                    strarray[j+1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(strarray));
    }
}
