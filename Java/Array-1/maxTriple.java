public int maxTriple(int[] nums) {
   int c[]={nums[0],nums[nums.length/2],nums[nums.length-1]};
   if(c[0]>c[1]&&c[0]>c[2])
   return c[0];
   if(c[1]>c[0]&&c[1]>c[2])
  return c[1];
  return c[2];
}
