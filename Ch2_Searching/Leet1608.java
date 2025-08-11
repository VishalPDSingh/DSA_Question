package Ch2_Searching;

public class Leet1608 {

  public static boolean checkIfExist(int[] arr) {
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j && (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i])) {
          found = true;
          break;
        }
      }
    }
    return found;
  }

  public static void main(String[] args) {
    int nums[] = { 0, 2, -2 };
    boolean ans = checkIfExist(nums);
    System.out.println(ans);
  }
}
