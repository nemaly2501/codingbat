public boolean noTriples(int[] num) {
  int i,c=0;
  for(i=0;i<num.length-2;i++)
  if(num[i]==num[i+1]&&num[i+1]==num[i+2])
  return false;
  return true;
}
