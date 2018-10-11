public int[] shiftLeft(int[] nums) {
  if(nums.length<1)
  return nums;
  int i=nums[0];
  for(int j=1;j<nums.length;j++)
  nums[j-1]=nums[j];
  nums[nums.length-1]=i;
  
  return nums;
  
}