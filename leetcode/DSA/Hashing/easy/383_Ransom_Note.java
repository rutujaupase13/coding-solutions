class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        // counting char from magazine
        for(int i = 0; i< magazine.length();i++)
        {
            int index = magazine.charAt(i) - 'a';
            arr[index] += 1;
        }

        for(int i = 0; i < ransomNote.length();i++)
        {
            int index = ransomNote.charAt(i) - 'a';
            if(arr[index] > 0)
            {
                arr[index]--;
            }
            else if(arr[index] <= 0)
            {
                return false;
            }
        }

        return true;
    }
}