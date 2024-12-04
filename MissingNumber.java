class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length; 
        int expectedSum = (n * (n + 1)) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1}; // Missing number is 2
        int missing = solution.missingNumber(nums);
        System.out.println("Missing Number: " + missing);
    }
}
