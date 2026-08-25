class Solution {
    public int missingMultiple(int[] nums, int k) {

        int[] arr = new int[101];

        for(int i = 0;i < nums.length;i++)
        {
            arr[nums[i]] += 1;
        }

        int count = 0;
        for(int i = 1;i < arr.length;i++)
        {
            if(i % k == 0 && arr[i] == 0)
            {
                count = i;
                break;
            }
        }
         
      if(count == 0)
      { 
         int i = 101;
          while(i > 0)
          {
             if(i % k == 0)
             {
                count = i;
                break;
             }

             i++;
          }
      }
      return count;
    }
}