public int array667(int[] num) {
  int i,c=0;
  for(i=0;i<num.length-1;i++)
  if(num[i]==6&&(num[i+1]==6||num[i+1]==7))
  c++;
  return c;
}
