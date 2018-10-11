public String withoutX(String s) {
  if(s.length()<2)
  return "";
  if(s.charAt(0)=='x'&&s.charAt(s.length()-1)=='x')
  return s.substring(1,s.length()-1);
  if(s.charAt(0)=='x')
  return s.substring(1);
  if (s.charAt(s.length()-1)=='x')
  return s.substring(0,s.length()-1);
  return s;
}
