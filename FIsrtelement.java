public class FIsrtelement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 10, 4, 5, 6};
       int target=4;
      int result=element(arr,target,0);
        System.out.println(result);
    }

    public static int element(int[] arr, int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        int ind= element(arr,target,index+1);
        return ind;
    }
}
