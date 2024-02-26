package Recursion_Subset.Subsets;
// Q. skip character 'a' from the Given Word
// Q. skip String from the given word
public class _2skip_string {
    public static void main(String[] args){
//        System.out.println(skip_str("Asafapplesfs"));

        System.out.println(skip_app("gapprapplel"));



//        char[] chr = str.toCharArray();


    }
    static String skip_str(String str){
        if(str.isEmpty()){
            return "";
        }



        if(str.startsWith("apple")){
            return skip_str(str.substring(5));

        }
        else{
            return str.charAt(0) + skip_str(str.substring(1));
        }
    }
    // only skip the app when but not the apple
    static String skip_app(String str){
        if(str.isEmpty()){
            return "";
        }

//        if( str.startsWith("app")){
//            if( !str.startsWith("apple") ){
//                return skip_app(str.substring(3));
//            }
//        }
        
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skip_app(str.substring(3));
        }
        return  str.charAt(0) + skip_app(str.substring(1));
    }

}
