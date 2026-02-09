package Array;

public class MaximumProductSubarray {
    public static int product(int arr[]){
        int maxprod = arr[0];
        int minprod = arr[0];
        int result = arr[0];

        for(int i=1; i<arr.length; i++){
            int temp = maxprod;

            maxprod = Math.max(arr[i], Math.max(minprod * arr[i] , maxprod * arr[i]));
            minprod = Math.min(arr[i], Math.min(temp * arr[i] , minprod * arr[i]));

            result = Math.max(result, maxprod);
        }
        return result;
    }
    public static void main(String[] args){
        int arr[] =  {2, 3, -2, 4};
        System.out.println("The Maximum product Subarray: "+ product(arr));
    }
}
