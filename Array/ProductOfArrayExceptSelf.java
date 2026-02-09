package Array;

public class ProductOfArrayExceptSelf{
    public static int[] product(int arr[]){
        int n = arr.length;
        int result [] = new int[n];

        //prefix
        result[0] = 1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1] * arr[i-1];
        }

        //suffix (right to left)
        int suffix = 1;
        for(int i= n-1; i>=0; i-- ){
            result[i] *= suffix;
            suffix *= arr[i];
        }
        return result;
    }
    public static void main(String[] args){
        int arr[] ={1,2,3,4};
        int result[] = product(arr);

        System.out.println("The product of Array Except Self");
        for(int val : result ){
            System.out.print(val+ " ");
        }
    }
}