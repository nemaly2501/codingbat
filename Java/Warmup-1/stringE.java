public boolean stringE(String str) {
  int i=str.length()-1,c=0;
  while(i>=0){
    if(str.charAt(i)=='e')
    c++;i--;}
    return(c>=1&&c<=3);
  }