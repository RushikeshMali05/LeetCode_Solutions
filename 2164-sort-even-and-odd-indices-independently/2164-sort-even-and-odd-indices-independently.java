class Solution {
public int[] sortEvenOdd(int[] nums) {
ArrayList<Integer> even=new ArrayList<>();
ArrayList<Integer> odd=new ArrayList<>();
    for(int i=0;i<nums.length;i++)
{
if(i%2 == 0)
{
even.add(nums[i]);
}
else
{
odd.add(nums[i]);
}
}
Collections.sort(even);
Collections.sort(odd,Comparator.reverseOrder());
int e=0,o=0;
for(int i=0;i<nums.length;i++)
{
nums[i]=even.get(e);
e++;
i++;
if(i==nums.length)
{
break;
}
nums[i]=odd.get(o);
o++;
}
return nums;
}
}