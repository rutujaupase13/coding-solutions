class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] first = new int[2]; 

        for(int i = 0;i < nums.length;i++)
        {
            for(int j = i+1;j < nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    first[0] = i;
                    first[1]= j;
                    break;
                }
            }
        }
     return first;
    }
}