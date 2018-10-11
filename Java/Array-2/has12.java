public boolean has12(int[] nums) {
  for(int i=0;i<nums.length;i++)
  if(nums[i]==1)
  while(i<nums.length-1)
  {i++;
  if(nums[i]==2)
  return true;
}
return false;
}