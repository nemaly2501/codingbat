public String frontTimes(String str, int n) {
   String s="";
  while(n!=0){
    if (str.length()<3)
  s=s+str;else s=s+str.substring(0,3);n--;}
  return s;
}
