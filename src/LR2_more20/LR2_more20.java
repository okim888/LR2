package LR2_more20;

public class LR2_more20 {
    public static void main(String[] args) {
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));
    }

    public static boolean more20(int n) {
        if ((n-1) % 20 == 0 || (n-2) % 20 ==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
