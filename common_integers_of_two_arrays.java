import java.util.*;

public class common_integers_of_two_arrays {

  public static int[] findcommon(int[] arr, int[] arr2){

    List<Integer> comm = new ArrayList<>();
  
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr2.length; j++){
        if(arr[i] == arr2[j]){
          comm.add(arr[i]);
          break;
        }
      }
    }

    int[] ans = new int[comm.size()];
    for(int i=0; i<comm.size(); i++){
      ans[i] = comm.get(i);
    }

    return ans;
  }

  public static void main(String[] args) {
    
    int[] arr = {1, 2, 3, 4};
    int[] arr2 = {2, 5, 6, 1};

    int[] ans = findcommon(arr, arr2);
    for(int num : ans){
      System.out.print(num + " ");
    }

  }
}

