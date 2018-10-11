public int[] reverse3(int[] num) {
  int t,i=0;
   t=num[i];
  num[i]=num[i+2];
  num[i+2]=t;
  return num;
}
