boolean doubleX(String str) {
  
  int i=str.indexOf( 'x' );
  if((i+1)<str.length()&&str.charAt(i+1)=='x'&&i>=0)
  return true;
  return false;
}
