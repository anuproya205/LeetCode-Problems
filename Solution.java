class Solution{
public int maxProduct(int[]nums){
int smax=-1;
int max=-1;
for(int i=0;i<nums.length;i++){
if(max<nums[i]){
smax=max;
max=nums[i];
}else if(smax<nums[i]){
smax=nums[i];
}
}
int ans=(max-1)*(smax-1);
return ans;

}
public static void main(String[] args) {
  Solution solution = new Solution();
  int[] nums = {3, 4, 5, 2};
  int result = solution.maxProduct(nums);
  System.out.println("Maximum Product: " + result);
}
}
