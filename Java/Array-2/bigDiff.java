public int bigDiff(int[] num) {
  int m1=num[0],m2=num[0];
  for(int i=1;i<num.length;i++)
  {m1=Math.min(m1,num[i]);
  m2=Math.max(m2,num[i]);
}
return (m2-m1);
}
