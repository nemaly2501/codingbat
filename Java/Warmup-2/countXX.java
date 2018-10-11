int countXX(String str) {
  int c=0;
  for(int i=0;i<str.length();i++)
  if((str.substring(i)).startsWith("xx"))
  c++;
  return c;
}
