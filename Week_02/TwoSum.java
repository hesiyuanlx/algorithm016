public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int naNum = target - nums[i];
            if (map.containsKey(naNum)) {
                return new int[] { map.get(naNum), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

}