public int[] rotateLeft3(int[] num) {
  int i,t;
  for(i=0;i<2;i++){
  t=num[i];
  num[i]=num[i+1];
  num[i+1]=t;
}
return num;}