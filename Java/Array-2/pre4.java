public int[] pre4(int[] nums) {
  int i=0,c=0;
  while(nums[i]!=4){
  c++;i++;
}
int n[]=new int[c];
for(i=c-1;i>=0;i--)
n[i]=nums[i];
return n;
}
