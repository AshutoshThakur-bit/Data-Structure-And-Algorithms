package Array;
public class FindMinInRotatedSortedArray{

    public static int minimumrotatedarray(int[] arr){
    int left = 0;
    int right = arr.length-1;

    if(arr[left] <= arr[right]){
        return arr[left];
    }
    while (left < right){
        int mid = left + (right - left)/2;

        if(arr[mid] > arr[right]){
            left = mid +1;
        }else{
            right = mid;
        }
    }
    return arr[left];
}
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("The sorted rotated minimum array: "+minimumrotatedarray(arr));

    }
}