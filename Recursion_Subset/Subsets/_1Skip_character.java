package Recursion_Subset.Subsets;
// skip character from the given String ,
public class _1Skip_character {
    public static void main(String[] args){

//        skip_A("", "asfslasal");
//        String str = "gourav";
//        System.out.println(str.substring(1));

        System.out.println(skip_rtn("asfskfas"));
    }

//     using recursive approach
    static void skip_A( String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skip_A( ans, str.substring(1) );
        }else{
            skip_A( ans + ch, str.substring(1));
        }
    }

    static String skip_rtn(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip_rtn(str.substring(1));

        }
        else{
            return  ch + skip_rtn(str.substring(1));
        }
    }
}
