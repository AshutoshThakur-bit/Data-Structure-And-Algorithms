public class reverseint{ 

    public static void reverseinteger(int num){
        int rev = 0;
        while(num > 0){
            int digit = num %10;
            rev = rev * 10 +digit;
            num = num / 10;
            
        }

    }
    public static void main(String[] args){
        int num = 123456;
        reverseinteger(num);
    }
}