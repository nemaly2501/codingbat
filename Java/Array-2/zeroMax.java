public int[] zeroMax(int[] nums) {
  for(int i=0;i<nums.length;i++)
  if(nums[i]==0)
  {
    int max=0;
    for(int j=i;j<nums.length;j++)
    if(nums[j]>max&&nums[j]%2!=0)
    max=nums[j];
    nums[i]=max;
  }
  return nums;
}
