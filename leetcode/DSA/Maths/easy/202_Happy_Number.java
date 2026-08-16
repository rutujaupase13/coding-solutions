class Solution {
    public boolean isHappy(int n) {
       // if(n < 1) return false;
        int temp, current = n;
       while(current > 9)
       {
         temp = 0;
        while(current > 0)
        {
            int count = current % 10;
            temp = temp + (count * count);
            current = current / 10;
        }
          current = temp;
       }   

       return (current == 1 || current == 7);
    }
}