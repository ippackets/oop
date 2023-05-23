public class _17_3_ReverseAString {
    public static void main(String[] args) {
        String[] arr = {"abc", "bcd"};
        String rev = "";
        //builtin method 
        StringBuilder str1 = new StringBuilder(arr[0]);
        str1.reverse();
        System.out.println(str1);

        //manual method
        for (int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);
            rev = ch+rev;
        }

        System.out.println(rev);
        
    }
}
