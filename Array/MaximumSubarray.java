package Array;

public class MaximumSubarray {
    public static int maxsubarray(int nums[]){
        int currentsum = nums[0];
        int maxsum = nums[0];

        for(int i = 1; i<nums.length; i++){

            currentsum =  Math.max(nums[i] , currentsum + nums[i]);
            maxsum  = Math.max(maxsum, currentsum);

        }
        return maxsum;
    }
    public static void main(String[] args){
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("The maximum subarray is: "+ maxsubarray(nums));
    }
}
