public int countEvens(int[] num) {
  int c=0,i=0;
  for(i=0;i<num.length;i++)
  if(num[i]%2==0)
  c++;
  return c;
}
