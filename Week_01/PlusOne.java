
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            if (i == 0 && digits[i] == 9) {
                int[] ans = new int[digits.length + 1];
                ans[0] = 1;
                ans[1] = 0;
                for (int j = 1; j < digits.length; j++) {
                    ans[j] = 0;
                }
                return ans;
            }
            digits[i] = 0;
            continue;
        }
        return digits;
    }

}
