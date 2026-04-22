class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
                int i = l - 1;
                        while(i >= 0)
                                {
                                            if(digits[i] < 9){
                                                            digits[i]++;
                                                                            return digits;
                                                                                        }
                                                                                                    digits[i] = 0;
                                                                                                                i--;
                                                                                                                        }
                                                                                                                                int[] ans = new int[l + 1];
                                                                                                                                        ans[0] = 1;
                                                                                                                                                return ans;
    }
}