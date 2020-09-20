public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int currentNotZeroNumIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currentNotZeroNumIndex] = nums[i];
                currentNotZeroNumIndex += 1;
                continue;
            }
        }
        for (int j = currentNotZeroNumIndex; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
