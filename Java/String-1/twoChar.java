public String twoChar(String s, int in) {
  if(s.length()-in<2||in<0)
  return s.substring(0,2);
  return s.substring(in,in+2);
}
