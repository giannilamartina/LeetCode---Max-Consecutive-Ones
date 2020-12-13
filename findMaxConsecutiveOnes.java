class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                ++current;                
            }
            else if (current > max) {
                max = current;
            }
            else if (nums[i] == 0) {
                current = 0;
            }
            
        }
        return max;    
        
    }
    
}
