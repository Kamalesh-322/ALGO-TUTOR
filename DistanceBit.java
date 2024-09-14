public class DistanceBit {
    public static void main(String[] args) {
        int a=4;
        int b=11;
        int count=0;
        int result=a^b;
        System.out.println(Integer.toBinaryString(result));
        System.out.println(Integer.bitCount(result));

    }
}
