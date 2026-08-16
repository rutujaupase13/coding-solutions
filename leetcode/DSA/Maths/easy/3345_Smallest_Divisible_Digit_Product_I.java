class Solution {
    public int smallestNumber(int n, int t) {
     int num = 0;
     
    while(n <= 100)
    {
        int product = 1,num1 = n;
        System.out.println("Product1");
        while(num1 > 0)
       {
         product = product * (num1 % 10);
         num1 = num1 / 10;
       }
         System.out.println("Product2");
       if(product % t == 0)
       {
         System.out.println("Product3");
         num = n;
         break;
       }
        n=n+1;
    }

      return num;
    }
}