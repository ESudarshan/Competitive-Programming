class Solution {
     public int findComplement(int num) {
         int res = num;
         int bit = 1;
         while(num != 0) {
            num = num >> 1 ;  
            res = res ^ bit;
            bit = bit << 1;
         }
        return res;
    }
}