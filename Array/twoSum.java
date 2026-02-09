package Array;

import java.util.HashMap;

public class twoSum {
    public static int[] ttwosum(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }
    
    public static void main(String[] args){
        int arr[] = {2,7,5,3,3,1,};
        int target = 9;

        int result[] = ttwosum(arr, target);

        if(result.length > 0){
            System.out.println("{" + result[0]+" , "+ result[1] + " } ");
            System.out.println(arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        }else{
            System.out.println("Not pair found");
        }

    }
}
