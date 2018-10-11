public boolean sameEnds(int[] nums, int n) {
  if(n==0)
  return true;
  for(int i=0,c=n;i<n;i++,c--)
  if(nums[i]!=nums[nums.length-c])
  return false;
  return true;
}
