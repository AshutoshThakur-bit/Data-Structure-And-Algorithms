package DynamicProgramming;

public class ClimbingStairsOptimized {
    public static int stairs(int num){
        if(num == 0 || num == 1) return 1;

        int first= 1 , second = 1;
        for(int i = 2; i<=num; i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The climbing stairs is: "+ stairs(num));
        
    }
}
