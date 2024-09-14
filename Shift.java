import javax.xml.transform.SourceLocator;

public class Shift {
    public static void main(String[] args) {
        int value=3;
        int shiftBy=2;
        int result=value << shiftBy;
        System.out.println(value);
        System.out.println("binary"+Integer.toBinaryString(value));
        System.out.println("after left"+shiftBy);
        System.out.println(result);
        System.out.println("binary result"+Integer.toBinaryString(value));
    }
}
