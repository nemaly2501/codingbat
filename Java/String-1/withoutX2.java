public String withoutX2(String s) {
  if(s.length()<1)
  return s;
  if(s.startsWith("xx"))
  return s.substring(2);
  if (s.startsWith("x"))
  return s.substring(1);
  if(s.charAt(1)=='x')
  return s.substring(0,1)+s.substring(2);
  return s;
}
