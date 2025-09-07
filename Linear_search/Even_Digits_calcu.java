public class Even_Digits_calcu {
    // Function to check whether a number  contains even digits or not .
    
        public static void main(String[] args) {
            int[] nums = {12,345,2,6,7896,100000};
           System.out.println(findNumbers(nums));
    
            // System.out.println(digits2(-3999999));
        }
        static int findNumbers(int[] nums) { 
            int count = 0;
            for(int num : nums) {
                if (even(num)) {
                    count++;
                }
            }
            return count;
        }
    
        // function to check whether a number contains even digits or not
        static boolean even(int num) {
            int numberOfDigits = digits(num);
            /*
            if (numberOfDigits % 2 == 0) {
                return true;
            }
            return false;
             */
            return numberOfDigits % 2 == 0;
        }
    
        static int digits2(int num) { //-------->> [ Other way to caculate the digit ] //
            if (num < 0) {
                num = num * -1;
            }
            return (int)(Math.log10(num)) + 1;
        }
    
        // count number of digits in a number
        static int digits(int num) {
    
            if (num < 0) {        // For Negative Input 
                num = num * -1;
            }
    
            if (num == 0) {       // If Input is Zero
                return 1;
            }
    
            int count = 0;
            while (num > 0) {
                count++;
                num = num / 10; // num /= 10
            }
    
            return count;
        }
    }
