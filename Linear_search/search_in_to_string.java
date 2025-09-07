import java.util.Arrays;

public class search_in_to_string {
        public static void main(String[] args) {
            String name = "Kunal";
            char target = 'u';
            // System.out.println(search(name,target));
            System.out.println(Arrays.toString(name.toCharArray()));   // [ Arrays.toString ] is use to put character in the String .

        }
    
        static boolean search(String str, char target){
            if(str.length()==0){
                return false;
            }
    
            for(char ch : str.toCharArray()){  // Convert this string to new character array.  
                if(ch == target){
                    return true;
                }
            }                                    
            return false;                        
        }
        
    }
    
    
    
    

