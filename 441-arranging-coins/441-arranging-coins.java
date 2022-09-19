class Solution {
    public int arrangeCoins(int n) {
        
        long start = 0, end = n;
        long mid, temp;
        
        while (start <= end) {
            
            mid = start + (end - start) / 2;
            temp = mid * (mid + 1) / 2;

            if (temp == n)
                return (int)mid;
            else if (temp < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return (int)end;
    }
}