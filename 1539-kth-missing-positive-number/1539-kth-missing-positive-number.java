class Solution {
public int findKthPositive(int[] arr, int k) {
int s =0;
int e = arr.length -1;
while(s<=e)
{
int m = s+(e-s)/2;
if(arr[m]-(m+1)<k)//answer lies on the second half of array
{
s = m+1;
}
else
{
e = m-1;
}
}
return s+k;
}
}