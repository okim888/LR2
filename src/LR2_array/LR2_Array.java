package LR2_array;

public class LR2_Array {
    public static void main(String[] args) {

        System.out.println(sum3(new int[] {1, 2, 3}));
        System.out.println(sum3(new int[] {5, 11, 2}));
        System.out.println(sum3(new int[] {7, 0, 0}));
    }
        public static int sum3 (int[] nums){
            int sum3 = 0;
            for (int i = 0; nums.length > i; i++) {
                sum3 += nums[i];
            }

            return sum3;

        }

    }
