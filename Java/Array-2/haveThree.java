public boolean haveThree(int[] nums) {
  int i=0,c=0;
  for(i=0;i<nums.length;i++)
  if(nums[i]==3)
  c++;
  for(i=0;i<nums.length-1;i++)
  if(nums[i]==3&&nums[i+1]==3)
  return false;
  return (c==3);
}
