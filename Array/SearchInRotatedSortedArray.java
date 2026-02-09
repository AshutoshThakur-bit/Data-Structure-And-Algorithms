package Array;

public class SearchInRotatedSortedArray {
    public static int searchArray(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[left] <= arr[mid]){
            if(target >= arr[left] && target < arr[mid]){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }else{
            if(target > arr[mid] && target <= arr[right]){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
    }
    return -1;
    }
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;
        int result = searchArray(arr, target);

        if(result != -1){
            System.out.println("Search in Rotated sorted Array: " + result);
        }
        else{
            System.out.println("Not found");
        }
    }
}
