public class BruteForeXor {
    public static void main(String[] args) {
        int n=4;
        int result=calculateXOR(n);
        System.out.println(n+"  "+result);
    }
    public static int calculateXOR(int n){
        int res=0;
        for(int i=1;i<=n;i++)
        {
            res=res^i;
        }
        return res;
    }
}

