public int[] tenRun(int[] nums) {
   if(nums.length<1)
  return nums;
  int i,f=0,c=0;
  for(i=0;i<nums.length;i++)
  {
    if(nums[i]%10==0)
  {c=1; f=nums[i];}
  if(c==1)
  nums[i]=f;
}
return nums;
}
