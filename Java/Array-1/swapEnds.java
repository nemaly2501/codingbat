public int[] swapEnds(int[] num) {
   int t=num[0];
  num[0]=num[num.length-1];
  num[num.length-1]=t;
  return num;
}
