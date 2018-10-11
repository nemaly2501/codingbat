public String lastTwo(String s) {
  if (s.length()<2)
  return s;
  return( s.substring(0,s.length()-2)+s.substring(s.length()-1)+s.substring(s.length()-2,s.length()-1));
}
