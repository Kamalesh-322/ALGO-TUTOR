public class java1 {
    public static void main(String[] args) {
        int arr[]={1,2,10,4,5,6};
        maxfinder(arr);
    }
    public static void maxfinder(int arr[]) {
        int maxsum=0;
        for(int i=0;i<arr.length;i++) {
            maxsum=Math.max(maxsum,arr[i]);
        }
        System.out.println(maxsum);
    }
}
