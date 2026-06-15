public static boolean canWin(int a, int b, int w) {
        // Write your code here
      boolean count = false;
    int score = a + b;
    if(score >= w)
    {
        count = true;
    }
    
    
    return count;
    }