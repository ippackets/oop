import java.util.*;

public class contains_e_in_umbrella {
  public static void main(String[] args) {
    String word = "umbrella";
    char[] convert = word.toCharArray();
    char contains = 'e';
    int flag = 0;

    for(char c : convert){
      if(c == contains){
        System.out.println("Umbreall contains e");
        flag = 1;
      }
    }

    if(flag == 0){
      System.out.println("nope");
    }


    /* Shortcut
    if(word.contains(Character.toString(contains))){
      System.out.println("Contains e");
    }else{
      System.out.println("Nope");
    }
    */
  }
}
