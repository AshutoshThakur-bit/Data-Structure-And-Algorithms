public class sumofnumininteger{
    public static int findsum(String str){

        int num = 0;
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }else{
                sum += num;
                num = 0;
            }
        }
        sum += num;
        return sum;
    }
    public static void main(String[] args){

        String input = "a1b23c4";
        System.out.print(findsum(input));
    }
}