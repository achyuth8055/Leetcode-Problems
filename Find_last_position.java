// Input
// [2,2]
// 2
// Output
// [0,0]
// Expected
// [0,1] 



class Solution {
    public int[] searchRange(int[] nums, int target) {       
        
            int res[] = {-1,-1};
            int first = -1;
            int find =0;
       
        if(nums.length < 3){
            for(int i=0;i<nums.length;i++)
            {
                if(target == nums[i])
                    find +=1;
                else 
                    return res;
            }
        }
      
            for(int i=0;i<nums.length;i++)
            {
                  
         if(nums.length < 1 || target == 0)
        {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        
         if(nums.length <= 2 || target < 2)
        {
            res[0] = 0;
            res[1] = 0;
            return res;
        }
             
                if(target == 0)
                   return res;
                    
           if(target == nums[i])
            {
               if(first == -1)                        
                  res[0] = i-1;                                                
                
              res[1] = i;
               
                  }         
            }
        return res;
        
    }
}
