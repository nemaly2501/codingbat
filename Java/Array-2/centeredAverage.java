public int centeredAverage(int[] num) {
  int sum=0,m1=num[0],m2=num[0],i;
  for(i=0;i<num.length;i++)
  {m1=Math.min(m1,num[i]);
  m2=Math.max(m2,num[i]);
  sum=sum+num[i];
}return (sum-m2-m1)/(i-2);
}
