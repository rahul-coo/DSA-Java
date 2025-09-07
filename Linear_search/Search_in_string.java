public class Search_in_string {
    public static void main(String[] args) {
        String name= "Kunal";    // In string " " double quatation is only allowed.
        char target= 'u';
        System.out.println(search(name,target));
    }

    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }

        for(int i = 0 ; i < str.length() ; i++){
            if(target == str.charAt(i)){  //charAt : (a kind of function) is used to give the character at particular string at i index .
                return true;
            }
        }                                    
        return false;                        
    }n
    
}


