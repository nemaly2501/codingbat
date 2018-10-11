public boolean nearHundred(int n) {
  if((n<=210&&n>=190)||(n>=90&&n<=110))
  return true;
  return false;
}
// return ((Math.abs(100 - n) <= 10) ||(Math.abs(200 - n) <= 10));