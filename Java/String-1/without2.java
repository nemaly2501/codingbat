public String without2(String s) {
  if (s.length()<2)
  return s;
  if (s.endsWith(s.substring(0,2)))
  return s.substring(2);
  return s;
}