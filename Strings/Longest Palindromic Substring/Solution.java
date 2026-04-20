class Solution {
    public String longestPalindrome(String s) {
       if(s.isEmpty())
            return "";
        int n = s.length();
        int longest = 0, start = 0, end = 0;
        boolean[][] ans = new boolean[n][n];

        for(int i = 0;i < n;i++)
        {
            ans[i][i] = true;
            for(int j = 0;j < i;j++)
            {
                if(s.charAt(j) == s.charAt(i) && (i - j <= 2 || ans[j + 1][i - 1]))
                {
                    ans[j][i] = true;
                    if(i - j + 1  > longest)
                    {
                        longest = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}