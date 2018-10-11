public String front3(String str) {
  String s=str;
  if(str.length()>=3)
  s=str.substring(0,3);
  return s+s+s;
}
