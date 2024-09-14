class palindrom {
    public static void singleNumber(int[] nums) {

        int res = 0;

        for(int num : nums){
            res = res ^ num;
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        int nums[]={1,2,3,2,3,5,1,7,7,8,8,5,4};
       singleNumber(nums);

    }
}