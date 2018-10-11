public String altPairs(String str) {
  String s="";
  for(int i=0;i<str.length();i+=4)
  {
  s=s+str.charAt(i);
  if((i+1)<str.length())
  s=s+str.charAt(i+1);}
  return s;
}
