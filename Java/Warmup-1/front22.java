public String front22(String str) {
  if (str.length() <= 2) return str+str+str;
  
  String mid = str;
  
  // last + mid + first
  return str.substring(0,2) + mid + str.substring(0,2);
}