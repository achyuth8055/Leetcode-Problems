//Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        
            int x = 1;   
       
        for(int i = x ;i<nums.length;i++)
        {
            if(nums[i] > nums[x-1]) // assignes or re arranges the array only if condition is true
            {
                nums[x++] = nums[i]; // x++ x increments here
            }
        }
        
        return x; //return value of x
        
    }
}
