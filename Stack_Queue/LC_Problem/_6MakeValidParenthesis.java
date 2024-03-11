package Stack_Queue.LC_Problem;
//LC 921. Minimum Add to Make Parentheses Valid
import java.util.Stack;

public class _6MakeValidParenthesis {
    public static int minAddToMakeValid(String s) {
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                char peek = stack.peek();
                if( ch == ')' && peek == '('  ){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));

    }
}
