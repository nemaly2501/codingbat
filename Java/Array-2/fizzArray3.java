public int[] fizzArray3(int start, int end) {
  int n=end-start;
  int m[]=new int[n];
  for(int i=0;i<n;i++)
  {
  m[i]=start;
  start++;
}
return m;
}
