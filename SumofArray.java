public class SumofArray {
    public static void main(String[] args) {
        int arr[]={1,2,10,4,5,6};
        int result=sumofelement(arr,0);
        System.out.println(result);
    }
    public static int sumofelement(int[] arr,int index) {
        if(index==arr.length-1)
        {
            return arr[index];
        }
        int sum= sumofelement(arr,index+1);
        sum+=arr[index];
        return sum;
    }
}
