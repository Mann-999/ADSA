public class OneBitCharacter{
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length - 1) {
            if(bits[i] == 0) {
                i += 1;
            } else {
                i += 2;
            }
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] bits1 = {1, 0, 0};
        int[] bits2 = {1, 1, 1, 0};
        int[] bits3 = {0};

        System.out.println(sol.isOneBitCharacter(bits1)); 
        System.out.println(sol.isOneBitCharacter(bits2)); 
        System.out.println(sol.isOneBitCharacter(bits3)); 
    }
}
