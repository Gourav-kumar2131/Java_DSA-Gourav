package Linear_Search;

public class _4String_srch {
    public static void main(String[] args) {
        String name = "Gouav kumar Saw ";
        char target = 'k';
        System.out.println( str_srch(name,target) );

    }
//    private static boolean str_srch(String naam, char target){
//        char[] ch =naam.toCharArray();
//        if(naam.length()==0){
//            return false;
//        }
//        for(int i=0; i<ch.length ; i++){
//            if(ch[i]==target){
//                return true;
//            }
//        }
//        return false;
//    }

    private static boolean str_srch(String naam, char target){
        if(naam.length()==0){
            return false;
        }
        for(int i=0; i<naam.length() ; i++){
            if(target == naam.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
