public boolean has271(int[] num) {
  int i,c=0;
  for(i=0;i<num.length-2;i++)
  if((num[i]+5)==num[i+1]&& Math.abs(num[i+2] - (num[i]-1)) <= 2)
  return true;
  return false;
}
