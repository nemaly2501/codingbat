public int[] maxEnd3(int[] num) {
    int i,max;
    if(num[0]>num[2])
    max=num[0];
    else max=num[2];
  for(i=0;i<3;i++)
  num[i]=max;
 return num;
}
