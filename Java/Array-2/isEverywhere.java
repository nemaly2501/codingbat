public boolean isEverywhere(int[] num, int val) {
  for(int i=0;i<num.length-1;i++)
  if(!(num[i]==val||num[i+1]==val))
  return false;
  return true;
}
