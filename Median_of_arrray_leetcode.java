class Leet {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m+n;
        int res [] = new int[size];
        
        for(int i=0;i<m;i++)
        {
            res[i] = nums1[i];
        }

        for(int i=0;i<n;i++)
        {
            res[m + i] = nums2[i];
        }        

        //merged arrray
        for(int i=0; i<size; i++)
        {
            System.out.print(res[i] + " ");
        }

             for(int i=0;i<size;i++)
             {
                int temp;
                for(int j=i+1;j<size;j++)
                {
                    
                    if(res[i]>res[j])
                    {
                        temp = res[i];
                        res[i] = res[j];
                        res[j] = temp;
                    }
                                   
                }
             }
        
        float mid = (float)res.length/2;
        //  System.out.println("\n" + mid);
        double ret = 0;

        if((mid%2) == 0)
        {
            float result = mid-1;
            // System.out.println(" Mid Array : \n"+(float)(res[(int)result]+res[(int)mid])/2);
            // System.out.println(array[mid]);
             ret = res[(int)result]+(res[(int)mid]/2);
        }
        else if(mid%2 !=0)
        {
            // return  System.out.println(" Mid Array : \n"+(float) res[(int)mid]);
            
             ret = (float) res[(int)mid];
        }

          return ret;
        
    }
}
