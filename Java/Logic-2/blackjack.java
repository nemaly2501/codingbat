public int blackjack(int a, int b) {
  int d1=a,d2=b;
  if(d1>21)
  d1=0;
  if(d2>21)
  d2=0;
  int v=(d1>d2)?d1:d2;
  return v;}

