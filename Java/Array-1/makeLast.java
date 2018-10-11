public int[] makeLast(int[] n) {
  int c[]=new int[n.length*2];int i;
  for( i=0;i<n.length*2-1;i++)
  c[i]=0;
  c[i]=n[n.length-1];
  return c;
}
