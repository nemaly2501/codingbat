public String deFront(String s) {    
  if (s.charAt(0)=='a'&&s.charAt(1)=='b')
  return s;
  if (s.charAt(0)=='a')
  return s.substring(0,1)+s.substring(2);
  if (s.charAt(1)=='b')
  return s.substring(1);
  return s.substring(2);
  
}
