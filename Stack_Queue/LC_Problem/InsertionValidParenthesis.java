package Stack_Queue.LC_Problem;

import java.util.Stack;

//LC 1541. Minimum Insertions to Balance a Parentheses String
public class InsertionValidParenthesis {
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        ans++;
                    }
                }
                else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                        ans++;
                    }
                    else {// it means that the first element is ) and then the elements ar ()())
                        ans += 2;
                    }
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        return ans + (2* stack.size());
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("(()"));
    }

}


// main solution
//class Solution {
//    public int minInsertions(String s) {
//
//        Stack<Character> st = new Stack<>();
//        int n = s.length();
//
//        int ans = 0;
//        int k = 0;
//
//        for(int i=0; i<n-1; i++){
//            char ch = s.charAt(i);
//            if(ch=='(') st.push(ch);
//            else{
//                char x = s.charAt(i+1);
//                if(x==')'){
//                    if(st.size()==0) ans++;
//                    else st.pop();
//                    i++;
//                    if(i==n-1) k=1;
//                }else{
//                    if(st.size()==0) ans+=2;
//                    else{
//                        ans++;
//                        st.pop();
//                    }
//                }
//            }
//        }
//
//        int a = st.size();
//        char x = s.charAt(n-1);
//
//        if(k==0){
//            if(x=='(') ans=ans+2;
//            else{
//                if(a!=0){
//                    ans++;
//                    a--;
//                }else{
//                    ans+=2;
//                }
//            }
//        }
//
//        ans=ans+2*a;
//        return ans;
//    }
//}