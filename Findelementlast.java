public class Findelementlast {
    public static void main(String[] args) {
        int arr[] = {1, 4, 10, 5, 6};
        int target=0;
        int result = element(arr, arr.length-1, target);
        System.out.println(result);
    }
    public static int element(int[] arr,  int index,int target) {
        if (index<0) {
            return -1;
        }
            if (arr[index] == target) {
                return index;

            }
            int ind = element(arr, index - 1,target);
            return ind;
        }
    }

