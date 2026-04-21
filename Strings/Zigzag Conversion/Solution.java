class Solution {
    public String convert(String s, int numRows) {
        StringBuilder ans = new StringBuilder();
        int interval = (numRows + numRows - 2) == 0 ? 1 : (numRows + numRows - 2);

        for(int i = 0;i < numRows;i++)
        {
            for(int j = i; j < s.length();j += interval)
            {
                ans.append(s.charAt(j));

                if(i != 0 && i != numRows - 1 && j + interval - i * 2 < s.length())
                    ans.append(s.charAt(j + interval - i * 2));
            }
        }
        
        return ans.toString();
    }
}