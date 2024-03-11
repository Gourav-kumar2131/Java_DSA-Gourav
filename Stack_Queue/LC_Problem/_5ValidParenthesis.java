package Stack_Queue.LC_Problem;
// LC 20. Valid Parenthesis f
import java.util.*;

public class _5ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if( ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }

                }
                if( ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }

                }
                if(ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }

                }
            }
        }
        return stack.isEmpty();

    }

    public static boolean isValid2(String s){
        Stack<Character> stack = new Stack<>();
        char[] cs = s.toCharArray();
        for(int i=0; i < cs.length; i++){
            if(cs[i] == '(' || cs[i] == '{' || cs[i] == '[' ){
                stack.push(cs[i]);
            }
            else{
                if(cs[i] == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }if(cs[i] == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }if(cs[i] == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println( isValid2("()") );
    }
}

//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> p = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (p.empty())
//                p.push(c);
//            else {
//                Character peek = p.peek();
//                if ((peek == '(' && c == ')') ||
//                        (peek == '[' && c == ']') ||
//                        (peek == '{' && c == '}')) {
//                    p.pop();
//                } else {
//                    p.push(c);
//                }
//            }
//        }
//        return p.empty();
//    }
//}
