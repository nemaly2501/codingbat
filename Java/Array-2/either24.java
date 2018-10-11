public boolean either24(int[] n) {
  int a=0,b=0;
  for(int i=0;i<n.length-1;i++)
  {if(n[i]==2&&n[i+1]==2)
  a=1;
  if(n[i]==4&&n[i+1]==4)
  b=1;
}
if(a==1&&b==1)
return false;
if(a==1||b==1)
return true;
return false;
}