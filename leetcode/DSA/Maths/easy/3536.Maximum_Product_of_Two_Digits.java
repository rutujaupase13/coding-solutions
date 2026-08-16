class Solution {
    public int maxProduct(int n) {
        int max = 0;
    int i = 1;
    int count1 = 0, count2 = 0;

    int num1 = n,num2 = n;
    while(n > 0)
    {
        int temp = n % 10;
        count1++;
        while(num2 > 0)
        {
            count2++;
            if(count1 == count2) break;
            int temp2 = num2 % 10;
            i = temp * temp2;
            if(i > max)
            {
                max = i;
            }
            num2 = num2 / 10;
        }
        num2 = num1;
        n = n / 10;
        count2 = 0;
    }

    return max;
    }
}