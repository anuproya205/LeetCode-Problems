public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two numbers
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return null
        return null;
    }
    public static void main(String[] args) {
        // Create an instance of the TwoSum class
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
      //call TwoSum method
        int[] result = solution.twoSum(nums, target);
        // Print the result
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
