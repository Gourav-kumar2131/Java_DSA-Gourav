package Stack_Queue.LC_Problem;

import java.util.Stack;

public class _6MakeValidParenthesis2 {
    public static int makeValidparenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
          if(ch == ')'){
              if(!stack.isEmpty() && stack.peek() == '('){
                  stack.pop();
              }
              else{
                  stack.push(ch);
              }
          }
          else{
              stack.push(ch);
          }
        }
        return stack.size();

    }
    public static void main(String[] args) {
        System.out.println(makeValidparenthesis(")())"));
    }


    // Without using Stack.
//    class Solution {
//        public int minAddToMakeValid(String s) {
//            int opened = 0;
//            int ans = 0;
//
//            for(Character ch : s.toCharArray()){
//                if(ch == '('){
//                    opened++;
//                }
//                else{
//                    if(opened == 0){
//                        ans++;
//                    }
//                    else{
//                        opened--;
//                    }
//                }
//            }
//
//            return ans + opened;
//        }
//    }

}
