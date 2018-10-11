public int roundSum(int a, int b, int c) {
   int sum=ro(a)+ro(b)+ro(c);
  return sum;
}
public int ro(int num) {
  while(num%10!=0)
  { if(num%10<5)
  num--;
  if(num%10>=5)
  num++;
}
return num;}
