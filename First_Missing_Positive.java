// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.

// Input: nums = [3,4,-1,1]
// Output: 2
// // Explanation: 1 is in the array but 2 is missing.

// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.

class Solution {
    public int firstMissingPositive(int[] nums) {       
        
            Arrays.sort(nums);
            int inc = 0; 
            int ret = 1;
            int len = nums.length;
        for(int i=0;i<nums.length;i++)
        {            
            if(nums[0] == 0)
            {
                inc += 1;
                if(nums.length == inc)
                    return inc;
            }
            if(nums[i] == ret)
            {
                ret = ret + 1;
            }
               
            }
        return ret;
        
        
        
    }
}
