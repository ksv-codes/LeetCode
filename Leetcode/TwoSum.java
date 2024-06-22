public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };//use this way of returning array
                }
            }
        }
        return new int[0];//returing a empty array
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum tSum = new TwoSum();
        int[] result = tSum.twoSum(nums, target);
        System.out.println(result[0]+" "+result[1]);
    }
}
