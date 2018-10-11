public boolean more14(int[] nums) {
  int n1=0,n4=0;
  for(int i=0;i<nums.length;i++)
  {if(nums[i]==1)
  n1++;
  if(nums[i]==4)
  n4++;
}
return (n1>n4);
}