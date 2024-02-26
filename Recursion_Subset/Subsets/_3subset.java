package Recursion_Subset.Subsets;

import java.util.ArrayList;

public class _3subset {
    public static void main(String[] args) {
//        subseq("", "abc");

        // using String Builder
//        StringBuilder stb = new StringBuilder();
//        subseq_builder("", "abc", stb);
//        System.out.println(stb);

        // using ArrayList
        ArrayList<String> list = new ArrayList<>();  //-- useful one
          subseq_list("", "abc", list);
        System.out.println(list);





     }

    static void subseq(String p, String up){ // p -- processed String , up-- unprocessed String
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        subseq( p + ch , up.substring(1));
        subseq( p, up.substring(1));

    }
    static void subseq_builder(String p , String up, StringBuilder stbld){
      // for every function call new object has created
        if(up.isEmpty()){
            stbld.append(p + "\n");
            return;
        }

        char ch = up.charAt(0);

        // for every function call new object has created, we'r not changing the actual String (immutable)
        subseq_builder(p+ch, up.substring(1), stbld);
        subseq_builder(p, up.substring(1), stbld);


    }

    // using ArrayList Approach
    static void subseq_list(String p , String up, ArrayList<String> list){

        if(up.isEmpty()){
            list.add(p);
            return;
        }

        char ch = up.charAt(0);

        subseq_list(p+ch, up.substring(1), list);
        subseq_list(p, up.substring(1), list);


    }

}
