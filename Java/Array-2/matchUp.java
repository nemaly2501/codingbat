public int matchUp(int[] n1, int[] n2) {
  int c=0;
  for(int i=0;i<n1.length;i++)
  if(Math.abs(n1[i]-n2[i])==1||Math.abs(n1[i]-n2[i])==2)
  c++;
  return c;
}
