//Example 1 
//Input: nums = [1,3,5,6], target = 5
// Output: 2
//Example 2 
// Input: nums = [1,3,5,6], target = 2
// Output: 1
//Example 3 
// Input: nums = [1,3,5,6], target = 7
// Output: 4

class Solution {
    public int searchInsert(int[] nums, int target)
    {
        int res = 0;
        int len = nums.length;
        int var = 0;
         
        for(int i=0; i<nums.length; i++)
        {          
                  
            //if Element dont exist in middle of array           
            if(target > nums[len-1])                
                return len;   
            
            //if array element is not present and it should be in between array
           else if(nums[i] < target && nums[i+1] > target) 
            return i+1;
                 
            //found in array
           else if(nums[i] == target)
             return i;          
                      
        }       
        return res;
    }
}
