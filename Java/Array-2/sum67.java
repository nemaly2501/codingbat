public int sum67(int[] num) {
  int sum=0;
  for(int i=0;i<num.length;i++)
  {if(num[i]==6)
  while(num[i]!=7)i++;
  else sum=sum+num[i];
}
return sum;
}
