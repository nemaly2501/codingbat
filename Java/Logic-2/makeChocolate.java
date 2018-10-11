public int makeChocolate(int small, int big, int goal) {
  for(int i=big;i>=0;i--)
  for (int j=small;j>=0;j--)
  if(goal==(i*5+j))
  return j;
  return -1;
}
