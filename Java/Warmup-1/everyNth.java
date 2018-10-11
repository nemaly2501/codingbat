public String everyNth(String str, int n) {
  String s="";
  for(int i=0;i<str.length();i+=n)
  s=s+str.charAt(i);
  return s;
}
