public class Max_Wealth {
    
        public static void main(String[] args) {  // Input the number in the prompt.
            int[][] accounts = {{1,2,3},{2,3,4}};
            System.out.println(maximumWealth(accounts));

        }
        public static int maximumWealth(int[][] accounts) {
            // person = rol
            // account = col
            int ans = Integer.MIN_VALUE;

            // for(int person = 0; person ‹ accounts. length; person++) {
            for (int[] ints : accounts) {

                // when you start a new row, take a new sum for that row
                int sum = 0;

                // for (int account = 0; account ‹ accounts [person].length; account++) {
                //     sum += accounts [person] [account];
                for (int anInt : ints) {
                    sum += anInt;

                }
                // now we have sum of accounts of person
                // check with overall ans
                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;
        }
    }