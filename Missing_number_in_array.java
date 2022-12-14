//Missing number in array
//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int res = n*(n+1)/2;
        int sum = 0;
        Arrays.sort(array);
        for(int i=0;i<n-1;i++){ sum += array[i]; }        
        return res-sum;
    }
}
