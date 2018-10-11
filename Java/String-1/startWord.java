public String startWord(String s, String w) {
  if((s.length()<w.length())&&s.length()<2)
  return "";
  if(s.length()<2)
  return s;
  if(w.length()==1)
  return s.substring(0,1);
  String a=s.substring(1,w.length()),b=w.substring(1);
  if(a.equals(b))
  return s.substring(0,w.length());
  return "";
}
