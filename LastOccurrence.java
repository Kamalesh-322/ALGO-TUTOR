public class LastOccurrence {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3,3,3,6,7};
        int res=Binarysearch(arr,3);
        System.out.println(res);
    }
    public static int Binarysearch(int arr[],int target) {
        int ans=-1;
        int l=0;
        int r= arr.length-1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                ans= mid;
                l=mid+1;
            } else if (arr[mid] > target) {
                r=mid- 1;
            } else {

                l=mid + 1;
            }
        }
        return ans;
    }
}

