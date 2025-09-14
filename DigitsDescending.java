import java.util.Arrays;

public class DigitsDescending {
    public static int sortDigitsDescending(int num) {
        // Chuyển số thành mảng ký tự
        char[] digits = String.valueOf(num).toCharArray();
        // Sắp xếp giảm dần
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int num1 = 42145;
        int num2 = 145263;

        System.out.println("Input: " + num1 + " -> Output: " + sortDigitsDescending(num1));
        System.out.println("Input: " + num2 + " -> Output: " + sortDigitsDescending(num2));
    }
}
