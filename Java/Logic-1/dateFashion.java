public int dateFashion(int y, int d) 
{
  if(y<=2 || d<=2)
  return 0;
  if(y>=8 || d>=8)
  return 2;
  return 1;
}
