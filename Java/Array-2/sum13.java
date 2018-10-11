public int sum13(int[] num) {
  int sum=0;
  for(int i=0;i<num.length;i++)
  {if(num[i]==13)
  i++;
  else sum=sum+num[i];
}
return sum;
}