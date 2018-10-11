public int arrayCount9(int[] nums) {
  int c=0,i;
  if(nums.length<0) return 0;
  for(i=0;i<nums.length;i++)
  if(nums[i]==9)
  c++;
  return c;
}
