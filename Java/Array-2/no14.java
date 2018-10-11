public boolean no14(int[] nums) {
 int f=0,g=0;
  for(int i=0;i<nums.length;i++)
  {if (nums[i]==1)
  f++;
  if(nums[i]==4)
  g++;}
  if(f>0&&g>0)
  return false;
  return true;
}
