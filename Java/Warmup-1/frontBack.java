public String frontBack(String str) {
  int i=str.length();String s="";
  if(i==1)
  return str;
  if (i>1)
 s = str.charAt(i-1)+str.substring(1,i-1)+str.charAt(0);
  return s;
}
