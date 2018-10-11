public boolean has22(int[] num) {
  for(int i=0;i<num.length-1;i++)
  if (num[i]==2&&num[i+1]==2)
  return true;
  return false;
}
