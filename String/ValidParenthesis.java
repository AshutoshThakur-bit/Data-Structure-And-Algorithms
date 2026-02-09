package String;

import java.util.Stack;

public class ValidParenthesis{
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for( char c: s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            }else
            if( c == '['){
                stack.push(']');
            }else
            if( c == '('){
                stack.push(')');
            }else{
             if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }


        }
        return stack.isEmpty();
    }
     public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "([)]";
        String test3 = "{[]}";
        
        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // false
        System.out.println(isValid(test3)); // true
    }
}