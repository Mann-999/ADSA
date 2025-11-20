public class FindMin {

    public int findMin(int n) {
        int nC = 0;
        int[] coins =  { 1, 2, 5, 10 };
        int nearest = 0;
        
        while(n != 0) {
            for (int c : coins) {
                if (c <= n) nearest = c;
            }
            nC += n / nearest;
            n = n % nearest;
        }
        return nC;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.findMin(27)); 
        System.out.println(sol.findMin(3));  
        System.out.println(sol.findMin(99)); 
    }
}
