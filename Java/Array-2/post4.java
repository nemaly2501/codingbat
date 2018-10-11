public int[] post4(int[] nums) {
   int j=nums.length-1,i,c=0,a;
  while(nums[j]!=4){
  c++;j--;
}
int n[]=new int[c];
for(i=j+1,a=0;i<nums.length;a++,i++)
n[a]=nums[i];
return n;
}
