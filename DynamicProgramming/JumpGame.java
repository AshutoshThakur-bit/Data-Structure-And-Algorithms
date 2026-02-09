package DynamicProgramming;

public class JumpGame {

    public static boolean canjump(int[] nums){
        int maxreach = 0;

        for(int i =0; i<nums.length; i++){
            
            if(i> maxreach)return false;

            maxreach = Math.max(maxreach, i + nums[i]);

            if(maxreach >= nums.length-1)return true ;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
         int[] nums2 = {3, 2, 1, 0, 4};

           System.out.println("Input: [2, 3, 1, 1, 4]");
        System.out.println("Can reach end? " + canjump(nums1)); // true

        System.out.println("\nInput: [3, 2, 1, 0, 4]");
        System.out.println("Can reach end? " + canjump(nums2)); // false
    

    }
    
}
