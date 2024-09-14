public class XorForm {
    public static int xorForm(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n+1;
        }
        else if(n%4==3)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {
        int n=5;
        int result=xorForm(n);
        System.out.println(result);
    }
    }



