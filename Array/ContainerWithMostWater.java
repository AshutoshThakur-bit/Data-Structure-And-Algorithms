package Array;

public class ContainerWithMostWater {
    public static int maxarr(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int maxarea = 0;

        while(left < right){
            int width = right - left;
            int h = Math.min(arr[left] , arr[right]);
            int area = width * h;

            maxarea = Math.max(area, maxarea);

             if(arr[left] < arr[right]){
                left++;
             }else{
                right--;
             }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println("The max area is: "+ maxarr(arr));
    }
}
