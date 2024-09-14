public class BianrySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,6,7};
        int res=Binarysearch(arr,0,arr.length-1,3);
        System.out.println(res);

    }
    public static int Binarysearch(int arr[],int l,int r,int target) {
        int mid = (l + r) / 2;
        while (l <= r) {

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return l=mid + 1;
            } else if (arr[mid] > target) {
                return r=mid- 1;
            }

        }
        return -1;
    }
}

