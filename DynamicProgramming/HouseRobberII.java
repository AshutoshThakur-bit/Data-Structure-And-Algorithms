package DynamicProgramming;

public class HouseRobberII{
    public static int rob(int[] nums){
        if(nums == null || nums.length == 0)return 0;
        if(nums.length == 1)return nums[0];

        int case1 = roblinear(nums, 0, nums.length-2);
        int case2 = roblinear(nums, 1, nums.length-1);

        return Math.max(case1, case2);

    }

    public static int roblinear(int [] nums, int start, int end){
        int prev1 = 0, prev2 = 0;
        for(int i=start; i<=end; i++){
            int temp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp;
        }
        return prev1;

    }
    public static void main(String[] args) {
        int[] houses = {2, 3, 2};
        System.out.println("Maximum amount that can be robbed: " + rob(houses)); // Output: 3
    }
}