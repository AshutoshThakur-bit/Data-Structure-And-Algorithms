package Array;
import java.util.HashSet;

public class ContainDuplicate{
    public static void duplicate(int arr[]){
        int n = arr.length;
        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0; i<n; i++){
            if(seen.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                seen.add(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,3,4,5,6};
        System.out.println("The duplicate element is: ");
        duplicate(arr);
    }
}